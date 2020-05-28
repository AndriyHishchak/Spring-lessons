package com.Spring.Start.Lesson_25_Authorization_and_Authentication.controller;

import com.Spring.Start.Lesson_25_Authorization_and_Authentication.model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    //@AuthenticationPrincipal - забеспечує узяття даних із куків про user
    @GetMapping("/")
    public String index( @AuthenticationPrincipal User user,
            Model model){
        if(user !=null) {
            model.addAttribute("user",user.getUsername());
            return "index";
        }
        model.addAttribute("user", "anonumys");
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PreAuthorize(value = "hasAuthority('USER') or hasAuthority('ADMIN')")
    @GetMapping("/forUser")
    public String forUser(){
        return "forUser";
    }

    @PreAuthorize(value = " hasAuthority('ADMIN')")
    @GetMapping("/forAdmin")
    public String forAdmin(){
        return "forAdmin";
    }

}
