package com.Spring.Start.Lesson_30_Server_sent_Events.Events;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class BreakingnewsController {

    @GetMapping
    public String news(){
        return "news";
    }
}
