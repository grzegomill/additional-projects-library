package com.crud.library.controller;

import com.crud.library.domain.item.ItemDto;
import com.crud.library.mapper.ItemMapper;
import com.crud.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/items")
public class ItemController {

    @Autowired
    private DbService dbService;

    @Autowired
    private ItemMapper itemMapper;

    @PostMapping
    public void addItem(@RequestBody ItemDto itemDto) {
        dbService
                .saveItem(
                        itemMapper
                                .mapToItem(itemDto,
                                        dbService
                                                .findTitleById(
                                                        itemDto.getTitleId()
                                                )
                                )
                );

    }

}
