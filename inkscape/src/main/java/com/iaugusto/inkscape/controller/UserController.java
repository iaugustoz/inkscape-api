package com.iaugusto.inkscape.controller;

import com.iaugusto.inkscape.model.dto.UserDTO;
import com.iaugusto.inkscape.model.entities.User;
import com.iaugusto.inkscape.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody UserDTO dto) {
        User newUser = userService.registerUser(dto);

        return ResponseEntity.status(201).body(newUser);
    }
}
