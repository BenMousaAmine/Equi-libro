package com.example.Equilibro.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn
    private User cliente;

    @ManyToOne
    @JoinColumn
   public Book book;

    private Date dataDiAcquisto;



    protected Cart() {
    }

    public Cart(User cliente, Book book, Date dataDiAcquisto) {
        this.cliente = cliente;
        this.book = book;
        this.dataDiAcquisto = dataDiAcquisto;
    }

    public User getCliente() {
        return cliente;
    }

    public void setCliente(User cliente) {
        this.cliente = cliente;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDataDiAcquisto() {
        return dataDiAcquisto;
    }

    public void setDataDiAcquisto(Date dataDiAcquisto) {
        this.dataDiAcquisto = dataDiAcquisto;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
