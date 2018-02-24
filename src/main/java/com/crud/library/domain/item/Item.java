package com.crud.library.domain.item;


// id egzemplarza, id tytułu oraz status (np. w obiegu, zniszczona, zagubiona),

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "item")


public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title_id")
    private Long titleId;

    @Column(name = "status")
    private String status;

}
