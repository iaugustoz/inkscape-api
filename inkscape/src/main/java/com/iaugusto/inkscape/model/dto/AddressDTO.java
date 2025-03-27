package com.iaugusto.inkscape.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record AddressDTO(
        @Pattern(
                regexp = "\\d{5}-\\d{3}",
                message = "CEP inválido. O formato correto é XXXXX-XXX"
        )
        @NotNull
        String zipcode,

        @NotNull
        String street,

        @NotNull
        Integer number,

        String complement,

        @NotNull
        String neighborhood,

        @NotNull
        String city,

        @NotNull
        @Pattern(regexp = "[A-Z]{2}", message = "Estado inválido. Use a sigla (ex: SP, RJ)")
        String state
        ) {
}
