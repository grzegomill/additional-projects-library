package com.crud.library.repository;

import com.crud.library.domain.item.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

    @Override
    Item save(final Item title);
}
