package guru.qa.rococo.controller;

import java.util.Date;

import guru.qa.rococo.model.SessionDto;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SessionController {
    @GetMapping("/session")
    public SessionDto session(@AuthenticationPrincipal Jwt principal) {
        if (principal != null) {
            return new SessionDto(
                    principal.getClaim("sub"),
                    Date.from(principal.getIssuedAt()),
                    Date.from(principal.getExpiresAt())
            );
        } else {
            return SessionDto.empty();
        }
    }
}
