package com.iaugusto.inkscape.model.entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * Representa o produto livro no sistema Inkscape
 *
 * @author Igor A. Santana
 * @since 1.2.0
 */
@Entity(name = "Book")
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private String isbn;

    private String genre;

    private int yearPublication;

    private int stock;

    private BigDecimal price;

    private String imageURL;


}
