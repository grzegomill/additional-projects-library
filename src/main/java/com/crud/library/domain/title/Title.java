package com.crud.library.domain.title;

import com.crud.library.domain.item.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// id tytułu, tytuł, autora i rok wydania,
@Getter
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


    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "title")
    private Set<Item> items = new HashSet<>();


    public Title(Long id, String title, String author, Integer year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
