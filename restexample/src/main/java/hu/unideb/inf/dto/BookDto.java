package hu.unideb.inf.dto;

import java.util.Objects;

//Data transfer object
//POJO - plain old java object
public class BookDto {

    private int id;
    private String isbn;
    private String title;
    private String author;

    public BookDto() {
    }

    public BookDto(int id, String isbn, String title, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return id == bookDto.id && Objects.equals(isbn, bookDto.isbn) && Objects.equals(title, bookDto.title) && Objects.equals(author, bookDto.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn, title, author);
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
