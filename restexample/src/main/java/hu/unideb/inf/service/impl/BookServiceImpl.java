package hu.unideb.inf.service.impl;

import hu.unideb.inf.dto.BookAddressDto;
import hu.unideb.inf.dto.BookDto;
import hu.unideb.inf.model.Book;
import hu.unideb.inf.model.Person;
import hu.unideb.inf.repository.BookRepository;
import hu.unideb.inf.service.BookService;
import hu.unideb.inf.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<BookDto> findAll() {
        return bookMapper.bookEntityListToDtoList(bookRepository.findAll());
    }

    @Override
    public BookDto findById(Integer id) {
        return bookMapper.bookEntityToDto(bookRepository.getReferenceById(id));
    }

    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book entity = bookMapper.bookDtoToEntity(bookDto);
        entity.setOwner(new Person(null,
                "John Doe",
                "Sample City",
                "john.doe@mail.com",
                Date.from(Instant.now())));
        entity = bookRepository.save(entity);

        return bookMapper.bookEntityToDto(entity);
    }

    @Override
    public List<BookDto> findAllByAuthor(String author) {
        List<Book> entities = bookRepository.findAllByAuthorIgnoreCase(author);
        return bookMapper.bookEntityListToDtoList(entities);
    }

    @Override
    public List<BookAddressDto> findAllAddress() {
        return bookMapper.bookEntityListToAddressDto(bookRepository.findAll());
    }
}
