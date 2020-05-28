package com.Spring.Start.Lesson_29_WebSocket.WebSocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pingPong")
public class WebSocketController {

    @GetMapping
    public String pingPong() {
        return "pingPong";
    }
}
