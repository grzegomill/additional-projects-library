package com.crud.library.controller;


import com.crud.library.domain.title.TitleDto;
import com.crud.library.mapper.TitleMapper;
import com.crud.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/titles")
public class TitleController {

    @Autowired
    private DbService dbService;

    @Autowired
    private TitleMapper titleMapper;


    @PostMapping
    public void addTitle(@RequestBody TitleDto titleDto) {
        dbService.
                saveTitle(
                        titleMapper.
                                mapToTitle(titleDto));
    }


    @GetMapping
    public List<TitleDto> geTitles() {

        return titleMapper
                .mapToTitleDtoList(
                        dbService
                                .getAllTitles()
                );
    }
}
