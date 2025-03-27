package com.iaugusto.inkscape.model.dto;

import com.iaugusto.inkscape.model.entities.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

public record UserDTO(
        @NotNull
        String name,

        @Email
        @NotNull
        String email,

        @NotNull
        String password,

        List<Address> address,

        String cellphone,

        @CPF(message = "CPF inválido. O formato é XXX.XXX.XXX-XX")
        @NotNull
        String cpf
) {}
