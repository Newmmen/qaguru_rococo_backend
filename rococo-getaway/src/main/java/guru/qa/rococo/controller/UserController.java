package guru.qa.rococo.controller;

import java.util.UUID;

import guru.qa.rococo.model.ArtistDto;
import guru.qa.rococo.model.UserDto;
import guru.qa.rococo.service.api.ArtistGrpcClient;
import guru.qa.rococo.service.api.UserGrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    public UserGrpcClient userGrpcClient;

    @Autowired
    public UserController(UserGrpcClient userGrpcClient){
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
