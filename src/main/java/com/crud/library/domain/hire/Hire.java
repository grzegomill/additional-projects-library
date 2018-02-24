package com.crud.library.domain.hire;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "hire")


//id egzemplarza, id czytelnika, datę wypożyczenia i datę zwrotu.
public class Hire {

    @Id
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "reader_id")
    private Long readerId;

    @Column(name = "rental_date")
    private Date rentalDate;

    @Column(name = "return_date")
    private Date returnDate;


}
