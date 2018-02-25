package com.crud.library.controller;

import com.crud.library.domain.reader.ReaderDto;
import com.crud.library.mapper.ReaderMapper;
import com.crud.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping
    public List<ReaderDto> geTitles() {

        return readerMapper
                .mapToReaderDtoList(
                        dbService
                                .getAllreaders()
                );
    }
}
