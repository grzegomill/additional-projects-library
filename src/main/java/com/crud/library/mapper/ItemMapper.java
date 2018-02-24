package com.crud.library.mapper;

import com.crud.library.domain.item.Item;
import com.crud.library.domain.item.ItemDto;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item mapToItem(ItemDto itemDto) {
        return new Item(
                itemDto.getId(),
                itemDto.getTitleId(),
                itemDto.getStatus());

    }

    public ItemDto mapToItemDto(Item item) {
        return new ItemDto(
                item.getId(),
                item.getTitleId(),
                item.getStatus());
    }


}
