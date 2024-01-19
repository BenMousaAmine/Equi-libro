package com.example.Equilibro.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "user_book")
public class User_Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn
    private  User user ;

    @ManyToOne
    @JoinColumn
    private Book book ;

    public User_Book(User user, Book book) {
        this.user = user;
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    protected User_Book (){}


}

