package com.Spring.Start.Lesson_29_WebSocket.WebSocket.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Bean
    public PongWebSocket pongWebSocket () {
        return new PongWebSocket();
    }

    @Override//регіструэмо веб сокет щоб він спрацьовував по даному адресу
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
    webSocketHandlerRegistry.addHandler(pongWebSocket(),"/pong");
    }
}
