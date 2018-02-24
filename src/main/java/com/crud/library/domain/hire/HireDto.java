package com.crud.library.domain.hire;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class HireDto {

    private Long itemId;
    private Long readerId;
    private Date rentalDate;
    private Date returnDate;
}
