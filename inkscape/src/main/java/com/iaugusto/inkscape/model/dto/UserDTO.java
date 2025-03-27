package com.iaugusto.inkscape.model.dto;

import com.iaugusto.inkscape.model.entities.Address;

public record UserDTO(String name, String email, String password, Address address, String cellphone, String cpf) {
}
