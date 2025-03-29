package com.iaugusto.inkscape.service;

import com.iaugusto.inkscape.model.dto.UserDTO;
import com.iaugusto.inkscape.model.entities.User;
import com.iaugusto.inkscape.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public User registerUser(UserDTO dto) {
        if (userRepository.existsByEmail(dto.email())) {
            throw new IllegalArgumentException("E-mail já cadastrado.");
        }

        User user = modelMapper.map(dto, User.class);
        //user.setPassword();

        return userRepository.save(user);
    }
}
