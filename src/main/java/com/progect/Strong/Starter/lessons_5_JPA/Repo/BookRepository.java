package com.progect.Strong.Starter.lessons_5_JPA.Repo;


import com.progect.Strong.Starter.lessons_5_JPA.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
