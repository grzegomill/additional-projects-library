package com.crud.library.repository;

import com.crud.library.domain.hire.Hire;
import org.springframework.data.repository.CrudRepository;

public interface HireRepository extends CrudRepository<Hire, Long> {

    @Override
    Hire save(final Hire title);
}
