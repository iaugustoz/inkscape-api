package com.iaugusto.inkscape.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;
import java.util.UUID;

/**
 *
 * Representa os dados de um cliente no sistema Inkscape.
 *
 * @author Igor A. Santana
 * @version 1.0.0
 * @since Mar 25, 2025
 */
@Entity(name = "User")
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String name;

    @Email
    @Column(
            nullable = false,
            unique = true,
            length = 150
    )
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    @OneToMany(
            mappedBy = "client",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Address> addresses;

    @Column(length = 15)
    private String cellphone;

    @CPF(message = "CPF inválido. O formato é XXX.XXX.XXX-XX")
    @Column(
            nullable = false,
            unique = true,
            length = 14
    )
    private String cpf;
}
