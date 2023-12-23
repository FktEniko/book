package hu.unideb.inf.service;


import hu.unideb.inf.dto.BookAddressDto;
import hu.unideb.inf.dto.BookDto;
import hu.unideb.inf.model.Book;
import hu.unideb.inf.repository.BookRepository;
import hu.unideb.inf.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    List<BookDto> findAll();
    BookDto findById(Integer id);
    BookDto saveBook(BookDto bookDto);
    List<BookDto> findAllByAuthor(String author);

    List<BookAddressDto> findAllAddress();
}
