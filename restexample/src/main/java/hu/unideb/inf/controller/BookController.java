package hu.unideb.inf.controller;

import hu.unideb.inf.dto.BookDto;
import hu.unideb.inf.model.Book;
import hu.unideb.inf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Controller
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookService bookService;

    ArrayList<Book> books;

    @GetMapping("/init")
    public String init() {
        books = new ArrayList<>();

        books.add(new Book("1234567890", "Spring in Action", "Craig Walls"));
        books.add(new Book("9876543210", "Clean Code", "Robert C. Martin"));
        books.add(new Book("1112223334", "Design Patterns", "Erich Gamma"));

        return "success";
    }

    @GetMapping("/helloworld")
    public ResponseEntity<String> helloWorld() {
        String s = "Hello, world!";
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @GetMapping("/getbook")
    public Book getBook() {
        return new Book("1234567890", "Spring in Action", "Craig Walls");
    }

    @GetMapping("/getbyisbn")
    public ResponseEntity<Book> getBookByISBN(@RequestParam String isbn) {
        Book found = books.stream()
                .filter(x -> x.getIsbn().equals(isbn))
                .findAny()
                .orElse(null);

        if (found != null) {
            return new ResponseEntity<>(found, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getbyauthor/{author}")
    public List<BookDto> getByAuthor(@PathVariable String author) {
        return bookService.findAllByAuthor(author);
    }

    @PostMapping("/addbook")
    public List<BookDto> addBook(@RequestBody BookDto book) {
        bookService.saveBook(book);
        return bookService.findAll();
    }

    @GetMapping("/getallbooks")
    public List<BookDto> getAllBooks() {
        return bookService.findAll();
    }
}

