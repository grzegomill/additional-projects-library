package com.crud.library.repository;

import com.crud.library.domain.reader.Reader;
import org.springframework.data.repository.CrudRepository;

public interface ReaderRepository extends CrudRepository<Reader, Long> {

    @Override
    Reader save(final Reader title);

}
