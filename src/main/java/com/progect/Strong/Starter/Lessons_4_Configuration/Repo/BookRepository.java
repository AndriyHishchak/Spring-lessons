package com.progect.Strong.Starter.Lessons_4_Configuration.Repo;


import com.progect.Strong.Starter.Lessons_4_Configuration.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}