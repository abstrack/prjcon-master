package ru.michail.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Admin on 10/4/16.
 */
@Entity

@Table(name="book")
public class    Book implements Serializable{
    @SequenceGenerator (name="book_id_seq", sequenceName = "book_id_seq")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,  generator = "book_id_seq")
    @Column(name="id")
    private Integer id;
    @Column(name="book_title")
    private String title;
    @Column(name="book_author")
    private String author;
    @Column(name="book_price")
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book() {
    }

    public Book(String title, String author, Integer price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
