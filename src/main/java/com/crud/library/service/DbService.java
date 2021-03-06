package com.crud.library.service;

import com.crud.library.domain.hire.Hire;
import com.crud.library.domain.item.Item;
import com.crud.library.domain.reader.Reader;
import com.crud.library.domain.title.Title;
import com.crud.library.repository.HireRepository;
import com.crud.library.repository.ItemRepository;
import com.crud.library.repository.ReaderRepository;
import com.crud.library.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    private HireRepository hireRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private TitleRepository titleRepository;


    //HIRE
    public Hire saveHire(final Hire hire) {

        return hireRepository.
                save(hire);
    }


    //ITEM
    public Item saveItem(final Item item) {
        return itemRepository
                .save(item);
    }

    public List<Item> getAllItems() {

        return itemRepository
                .findAll();
    }


    //READER
    public Reader saveReader(final Reader reader) {
        return readerRepository
                .save(reader);
    }


    public List<Reader> getAllreaders() {

        return readerRepository
                .findAll();
    }



    //TITLE
    public Title saveTitle(final Title title) {
        return titleRepository
                .save(title);
    }

    public Title findTitleById(final Long id) {

        return titleRepository
                .findOne(id);

    }

    public List<Title> getAllTitles() {

        return titleRepository
                .findAll();
    }


}
