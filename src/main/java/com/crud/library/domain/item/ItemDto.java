package com.crud.library.domain.item;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ItemDto {

    private Long id;
    private Long titleId;
    private String status;
}
