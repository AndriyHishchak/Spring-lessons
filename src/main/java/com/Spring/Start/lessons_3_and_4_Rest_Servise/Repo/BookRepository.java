package com.Spring.Start.lessons_3_and_4_Rest_Servise.Repo;


import com.Spring.Start.lessons_3_and_4_Rest_Servise.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
