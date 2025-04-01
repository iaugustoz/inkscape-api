package com.iaugusto.inkscape.controller;

import com.iaugusto.inkscape.model.dto.ClientDTO;
import com.iaugusto.inkscape.model.entities.Client;
import com.iaugusto.inkscape.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/register")
    public ResponseEntity<Client> registerUser(@Valid @RequestBody ClientDTO dto) {
        Client newClient = clientService.registerUser(dto);

        return ResponseEntity.status(201).body(newClient);
    }
}
