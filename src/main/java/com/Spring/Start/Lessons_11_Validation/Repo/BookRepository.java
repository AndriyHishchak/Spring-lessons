package com.Spring.Start.Lessons_11_Validation.Repo;


import com.Spring.Start.Lessons_11_Validation.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
