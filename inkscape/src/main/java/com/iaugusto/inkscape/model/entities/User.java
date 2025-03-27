package com.iaugusto.inkscape.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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

    private String name;

    @Email
    private String email;

    private String password;

    @OneToMany
    @JoinColumn(name = "adress_id")
    private List<Address> addresses;

    private String cellphone;

    @CPF(message = "CPF inválido. O formato é XXX.XXX.XXX-XX")
    private String cpf;
}
