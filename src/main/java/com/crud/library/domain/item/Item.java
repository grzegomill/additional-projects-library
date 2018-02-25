package com.crud.library.domain.item;


// id egzemplarza, id tytułu oraz status (np. w obiegu, zniszczona, zagubiona),

import com.crud.library.domain.title.Title;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "item")

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "title_id", nullable = false)
    private Title title;

    @Column(name = "status")
    private String status;

}
