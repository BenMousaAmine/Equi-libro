package com.example.Equilibro.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.*;
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    // @NotNull
    // @Size(min= 5 , max= 50)
    private String title ;
    // @NotNull
    // @Size(min= 5 , max= 20)
    private String author ;
    // @NotNull
    //  @Size(min= 5 , max= 20)
    private String homeProduction ;
    // @NotNull
    // @Max(2024)
    private Integer yearPublicaton ;
    //  @NotNull
    // @Min(1)
    private Integer price ;

    public Book(Long id, String title, String author, String homeProduction, Integer yearPublicaton, Integer price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.homeProduction = homeProduction;
        this.yearPublicaton = yearPublicaton;
        this.price = price;
    }





    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", homeProduction='" + homeProduction + '\'' +
                ", yearPublicaton=" + yearPublicaton +
                ", price=" + price +

                '}';
    }
    /*
       @ManyToMany(mappedBy = "books")
      @JoinTable (
               name = "user_book"
               , joinColumns = @JoinColumn(name = "book_id")
               , inverseJoinColumns = @JoinColumn(name = "user_id")
       )
    private Set<User> users = new HashSet<>();
*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Book() {
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

    public String getHomeProduction() {
        return homeProduction;
    }

    public void setHomeProduction(String homeProduction) {
        this.homeProduction = homeProduction;
    }

    public Integer getYearPublicaton() {
        return yearPublicaton;
    }

    public void setYearPublicaton(Integer yearPublicaton) {
        this.yearPublicaton = yearPublicaton;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(homeProduction, book.homeProduction) && Objects.equals(yearPublicaton, book.yearPublicaton) && Objects.equals(price, book.price) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, homeProduction, yearPublicaton, price);
    }
}


