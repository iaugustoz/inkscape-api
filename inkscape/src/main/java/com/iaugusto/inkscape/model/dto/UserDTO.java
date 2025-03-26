package com.iaugusto.inkscape.model.dto;

import com.iaugusto.inkscape.model.entities.Adress;

public record UserDTO(String name, String email, String password, Adress adress, String cellphone, String cpf) {
}
