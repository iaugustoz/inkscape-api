package com.iaugusto.inkscape.service;

import com.iaugusto.inkscape.model.dto.ClientDTO;
import com.iaugusto.inkscape.model.entities.Client;
import com.iaugusto.inkscape.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    private final ModelMapper modelMapper;

    public ClientService(ClientRepository clientRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.modelMapper = modelMapper;
    }

    public Client registerUser(ClientDTO dto) {
        if (clientRepository.existsByEmail(dto.email())) {
            throw new IllegalArgumentException("E-mail já cadastrado.");
        }

        Client client = modelMapper.map(dto, Client.class);
        //user.setPassword();

        return clientRepository.save(client);
    }
}
