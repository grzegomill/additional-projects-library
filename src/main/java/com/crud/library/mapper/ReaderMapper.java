package com.crud.library.mapper;

import com.crud.library.domain.reader.Reader;
import com.crud.library.domain.reader.ReaderDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReaderMapper {

    public Reader mapToReader(final ReaderDto readerDto) {
        return new Reader(
                readerDto.getId(),
                readerDto.getFirstName(),
                readerDto.getLastName(),
                readerDto.getCreated());
    }

    public ReaderDto mapToReaderkDto(final Reader reader) {
        return new ReaderDto(
                reader.getId(),
                reader.getFirstName(),
                reader.getLastName(),
                reader.getCreated());
    }


    public List<ReaderDto> mapToReaderDtoList(List<Reader> titleList) {

        return titleList.stream()
                .map(t -> new ReaderDto(
                        t.getId(),
                        t.getFirstName(),
                        t.getLastName(),
                        t.getCreated())
                )
                .collect(Collectors.toList());

    }

}
