package hu.infokristaly.keycloakauthenticatoin.controller;

//import org.springframework.security.oauth2.server.resource.introspection.OAuth2IntrospectionAuthenticatedPrincipal;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/user")
@SecurityRequirement(name = "Keycloak")
public class UserController {
    @GetMapping(path = "/info")
    public HashMap index() {

        //OAuth2IntrospectionAuthenticatedPrincipal user = (OAuth2IntrospectionAuthenticatedPrincipal)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Jwt user = (Jwt)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return new HashMap(){{
            put("sub", user.getClaimAsString("sub"));
            put("name", user.getClaimAsString("name"));
            put("email", user.getClaimAsString("email"));
            put("roles", user.getClaimAsStringList("roles"));
        }};
    }
}
