package com.Spring.Start.Lessons_5_Configuration.Repo;


import com.Spring.Start.Lessons_5_Configuration.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
