package com.crud.library.controller;

import com.crud.library.domain.reader.ReaderDto;
import com.crud.library.mapper.ReaderMapper;
import com.crud.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/readers")
public class ReaderController {

    @Autowired
    private DbService dbService;

    @Autowired
    private ReaderMapper readerMapper;

    @PostMapping
    public void addReader(@RequestBody ReaderDto readerDto) {
        dbService
                .saveReader(
                        readerMapper
                                .mapToReader(readerDto));
    }

}
