package com.crud.library.domain.reader;



import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

//id czytelnika, imię, nazwisko i datę założenia konta,

@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "reader")


public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "account_created")
    private Date created;

}
