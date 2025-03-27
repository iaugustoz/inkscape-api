package com.iaugusto.inkscape.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity(name = "Adress")
@Table(name = "adress")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(
            regexp = "\\d{5}-\\d{3}",
            message = "CEP inválido. O formato correto é XXXXX-XXX"
    )
    private String zipcode;

    private String street;

    private Integer number;

    private String complement;

    private String neighborhood;

    private String city;

    private String state;
}
