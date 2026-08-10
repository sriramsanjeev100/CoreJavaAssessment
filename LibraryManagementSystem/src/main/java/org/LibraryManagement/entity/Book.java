package org.LibraryManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String author;

    @Column(nullable = false, length = 50)
    private String category;

    @Column(nullable = false)
    private Integer totalCopies;

    @Column(nullable = false)
    private Integer availableCopies;

    public Book()
    {
    }

    public Book(String title, String author, String category, Integer totalCopies, Integer availableCopies)
    {
        this.title = title;
        this.author = author;
        this.category = category;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    public Integer getBookId()
    {
        return bookId;
    }

    public void setBookId(Integer bookId)
    {
        this.bookId = bookId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public Integer getTotalCopies()
    {
        return totalCopies;
    }

    public void setTotalCopies(Integer totalCopies)
    {
        this.totalCopies = totalCopies;
    }

    public Integer getAvailableCopies()
    {
        return availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies)
    {
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString()
    {
        return "Book ID : " + bookId +
                "\nTitle : " + title +
                "\nAuthor : " + author +
                "\nCategory : " + category +
                "\nTotal Copies : " + totalCopies +
                "\nAvailable Copies : " + availableCopies;
    }
}