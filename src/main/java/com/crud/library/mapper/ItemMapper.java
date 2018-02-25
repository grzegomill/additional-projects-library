package com.crud.library.mapper;

import com.crud.library.domain.item.Item;
import com.crud.library.domain.item.ItemDto;
import com.crud.library.domain.title.Title;
import org.springframework.stereotype.Component;

@Component

public class ItemMapper {

    public Item mapToItem(ItemDto itemDto, Title title) {

        return new Item(
                itemDto.getId(),
                title,
                itemDto.getStatus());

    }

    public ItemDto mapToItemDto(Item item) {

        return new ItemDto(
                item.getId(),
                item.getTitle()
                        .getId(),
                item.getStatus()
        );
    }


}
