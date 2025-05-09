package com.iaugusto.inkscape.model.entities;

import com.iaugusto.inkscape.model.enums.State;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;

/**
 *
 * Representa o endereço de um cliente no sistema Inkscape.
 *
 * @author Igor A. Santana
 * @version 1.0.0
 * @since Mar 26, 2025
*/
@Entity(name = "Address")
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(
            regexp = "\\d{5}-\\d{3}",
            message = "CEP inválido. O formato correto é XXXXX-XXX"
    )
    @Column(nullable = false, length = 9)
    private String zipcode;

    @Column(nullable = false, length = 255)
    private String street;

    @Column(nullable = false)
    private Integer number;

    @Column(length = 255)
    private String complement;

    @Column(nullable = false, length = 255)
    private String neighborhood;

    @Column(nullable = false, length = 100)
    private String city;

    @Pattern(regexp = "[A-Z]{2}", message = "Estado inválido. Use a sigla (ex: SP, RJ)")
    @Column(nullable = false, length = 2)
    private State state;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
}
