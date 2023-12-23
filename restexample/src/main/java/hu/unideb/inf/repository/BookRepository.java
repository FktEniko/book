package hu.unideb.inf.repository;

import hu.unideb.inf.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findAllByAuthorIgnoreCase(String author);
}