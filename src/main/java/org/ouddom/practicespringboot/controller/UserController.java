package org.ouddom.practicespringboot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@SecurityRequirement(name = "bearerAuth")
public class UserController {

    @Operation(summary = "Welcome")
    @GetMapping(value = "/welcome")
    public ResponseEntity<String> welcome() {
        String styledMessage =
                """
                        **************************************************
                        *                                                *
                        *            WELCOME TO USER INFORMATION         *
                        *                                                *
                        **************************************************

                        We are glad to have you here! Feel free to explore.
                        
                """;

        return ResponseEntity.ok().body(styledMessage);
    }
}
