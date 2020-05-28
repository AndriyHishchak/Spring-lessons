package com.Spring.Start.Lesson_23_Worker_messages.Repo;


import com.Spring.Start.Lesson_23_Worker_messages.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
