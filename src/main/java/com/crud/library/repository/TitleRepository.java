package com.crud.library.repository;

import com.crud.library.domain.title.Title;
import org.springframework.data.repository.CrudRepository;

public interface TitleRepository extends CrudRepository<Title, Long> {

    @Override
    Title save(final Title title);

    @Override
    Title findOne(Long id);
}
