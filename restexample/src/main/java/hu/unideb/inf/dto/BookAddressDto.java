package hu.unideb.inf.dto;

import java.util.Objects;

public class BookAddressDto {

    private int bookId;
    private Long ownerId;
    private String address;
    private String licensep;

    public BookAddressDto() {
    }

    public BookAddressDto(int bookId, Long ownerId, String address, String licensep) {
        this.bookId = bookId;
        this.ownerId = ownerId;
        this.address = address;
        this.licensep = licensep;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicensep() {
        return licensep;
    }

    public void setLicensep(String licensep) {
        this.licensep = licensep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAddressDto that = (BookAddressDto) o;
        return bookId == that.bookId && Objects.equals(ownerId, that.ownerId) && Objects.equals(address, that.address) && Objects.equals(licensep, that.licensep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, ownerId, address, licensep);
    }

    @Override
    public String toString() {
        return "BookAddressDto{" +
                "bookId=" + bookId +
                ", ownerId=" + ownerId +
                ", address='" + address + '\'' +
                ", licensep='" + licensep + '\'' +
                '}';
    }
}
