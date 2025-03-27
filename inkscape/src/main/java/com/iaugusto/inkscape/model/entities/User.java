package com.iaugusto.inkscape.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

@Entity(name = "User")
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
            mappedBy = "user",
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
