package com.iaugusto.inkscape.model.dto;

import com.iaugusto.inkscape.model.entities.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

@Schema(
        name = "Usuários",
        description = "Objeto de transferência de dados do Usuário"
)
public record ClientDTO(
        @Schema(
                description = "Nome completo do usuário",
                example = "Bryan Behr da Silva"
        )
        @NotNull
        String name,

        @Schema(
                description = "E-mail do usuário",
                example = "bryan.behr@mail.com"
        )
        @Email
        @NotNull
        String email,

        @NotNull
        String password,

        List<Address> address,

        @Schema(
                description = "Número de telefone do usuário",
                example = "+11 98765-4321"
        )
        String cellphone,

        @Schema(
                description = "CPF do usuário",
                example = "123.456.789.-00"
        )
        @CPF(message = "CPF inválido. O formato é XXX.XXX.XXX-XX")
        @NotNull
        String cpf
) {}
