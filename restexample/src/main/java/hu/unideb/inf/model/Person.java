package hu.unideb.inf.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SZEMELY")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "NEV")
    private String name;
    @Column(name = "CIM")
    private String address;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SZUL")
    private Date birth;

    public Person() {
    }

    public Person(Long id, String name, String address, String email, Date birth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.equals(email, person.email) && Objects.equals(birth, person.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, email, birth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                '}';
    }
}
