package com.iaugusto.inkscape.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

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

    @Column(nullable = false, length = 2)
    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
