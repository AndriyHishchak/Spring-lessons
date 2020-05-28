package com.Spring.Start.Lesson_25_Authorization_and_Authentication.Repo;

import com.Spring.Start.Lesson_25_Authorization_and_Authentication.model.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String name);
}

