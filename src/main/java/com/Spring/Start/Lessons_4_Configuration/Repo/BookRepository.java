package com.Spring.Start.Lessons_4_Configuration.Repo;


import com.Spring.Start.Lessons_4_Configuration.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
