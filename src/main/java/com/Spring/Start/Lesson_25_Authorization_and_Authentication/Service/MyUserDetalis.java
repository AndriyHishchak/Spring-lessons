package com.Spring.Start.Lesson_25_Authorization_and_Authentication.Service;

import com.Spring.Start.Lesson_25_Authorization_and_Authentication.Repo.UserRepo;
import com.Spring.Start.Lesson_25_Authorization_and_Authentication.model.RegistrationForm;
import com.Spring.Start.Lesson_25_Authorization_and_Authentication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetalis implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private UserRepo userRepo;
    @Autowired
    public MyUserDetalis(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }


}
