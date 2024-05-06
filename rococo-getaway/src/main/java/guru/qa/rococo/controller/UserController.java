package guru.qa.rococo.controller;

import guru.qa.rococo.model.UserDto;
import guru.qa.rococo.service.api.UserGrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    public UserGrpcClient userGrpcClient;

    @Autowired
    public UserController(UserGrpcClient userGrpcClient) {
        this.userGrpcClient = userGrpcClient;
    }

    @GetMapping("/user")
    public UserDto getCurrentUser(@AuthenticationPrincipal Jwt principal) {
        String username = principal.getClaim("sub");
        return userGrpcClient.getUser(username);
    }

    @PatchMapping("/user")
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userGrpcClient.updateUser(userDto);
    }


}
