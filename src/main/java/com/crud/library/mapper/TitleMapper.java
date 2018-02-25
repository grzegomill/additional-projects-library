package com.crud.library.mapper;

import com.crud.library.domain.title.Title;
import com.crud.library.domain.title.TitleDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TitleMapper {

    public Title mapToTitle(TitleDto titleDto) {
        return new Title(
                titleDto.getId(),
                titleDto.getTitle(),
                titleDto.getAuthor(),
                titleDto.getYear());
    }

    public TitleDto mapToTitleDto(Title title) {
        return new TitleDto(
                title.getId(),
                title.getTitle(),
                title.getAuthor(),
                title.getYear());
    }

    public List<TitleDto> mapToTitleDtoList(List<Title> titleList) {

        return titleList.stream()
                .map(t -> new TitleDto(
                        t.getId(),
                        t.getTitle(),
                        t.getAuthor(),
                        t.getYear())
                )
                .collect(Collectors.toList());

    }
}
