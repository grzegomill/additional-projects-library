package com.crud.library.domain.title;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// id tytułu, tytuł, autora i rok wydania,
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "title")

public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "year")
    private Integer year;

}
