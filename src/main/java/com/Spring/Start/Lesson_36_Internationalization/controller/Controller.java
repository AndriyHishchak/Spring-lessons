package com.Spring.Start.Lesson_36_Internationalization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @GetMapping
    public String index() {
        return "index_36";
    }
    @GetMapping("second")
    public String second(){
        return "second_36";
    }
}
