package com.Spring.Start.Lessons_11_Validation.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Is Null")
    @Size(min = 8,max = 20,message = "min 8 and max 20")
    private String author;
    @NotBlank(message = "Is Null")
    @Size(min = 8,max = 20,message = "min 8 and max 20")
    private String name;

    public Long getId() {
        return id;
    }

    public Book() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
