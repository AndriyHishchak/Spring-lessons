package com.Spring.Start.lessons_6_JPA.Repo;


import com.Spring.Start.lessons_6_JPA.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
