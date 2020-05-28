package com.Spring.Start.Lesson_25_Authorization_and_Authentication.controller;

import com.Spring.Start.Lesson_25_Authorization_and_Authentication.Repo.UserRepo;
import com.Spring.Start.Lesson_25_Authorization_and_Authentication.Service.MyUserDetalis;
import com.Spring.Start.Lesson_25_Authorization_and_Authentication.model.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private PasswordEncoder passwordEncoder;
    private UserRepo userRepo;


    @Autowired
    public RegistrationController(PasswordEncoder passwordEncoder, UserRepo userRepo, MyUserDetalis userDetalis) {
        this.passwordEncoder = passwordEncoder;
        this.userRepo = userRepo;

    }

    @GetMapping
    public String registration(){
        return "registration";
    }

    @PostMapping
    public String processUser (RegistrationForm form) {
        userRepo.save(form.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
