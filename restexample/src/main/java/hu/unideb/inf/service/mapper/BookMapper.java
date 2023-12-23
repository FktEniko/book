package hu.unideb.inf.service.mapper;

import hu.unideb.inf.dto.BookAddressDto;
import hu.unideb.inf.dto.BookDto;
import hu.unideb.inf.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(source = "id", target = "id")
    BookDto bookEntityToDto(Book book);

    List<BookDto> bookEntityListToDtoList(List<Book> books);

    @Mapping(target = "ownerId", source = "owner.id")
    @Mapping(target = "licensep", source = "isbn")
    @Mapping(target = "bookId", source = "id")
    @Mapping(target = "address", source = "owner.address")
    BookAddressDto bookEntityToAddressDto(Book book);

    List<BookAddressDto> bookEntityListToAddressDto(List<Book> books);

    @Mapping(target = "owner.id", source = "ownerId")
    @Mapping(target = "isbn", source = "licensep")
    @Mapping(target = "id", source = "bookId")
    Book bookAddressDtoToEntity(BookAddressDto bookAddressDto);

    List<Book> bookAddressDtoListToEntityList(List<BookAddressDto> bookAddressDtos);

    Book bookDtoToEntity(BookDto bookDto);

    List<Book> bookDtoListToEntityList(List<BookDto> bookDtos);
}













