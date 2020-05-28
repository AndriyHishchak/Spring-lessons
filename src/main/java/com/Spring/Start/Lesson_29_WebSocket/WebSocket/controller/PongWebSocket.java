package com.Spring.Start.Lesson_29_WebSocket.WebSocket.controller;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class PongWebSocket extends TextWebSocketHandler {
    @Override // відправка повідомлення
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        session.sendMessage(new TextMessage("connection established"));
    }
        //getPayload() - дыстаэ меседж
    @Override // сюда приходить повідомлення яке ми дістаємо, логінемо, та надсилаємо.
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
       System.out.println(message.getPayload());
        session.sendMessage(new TextMessage("Pong"));
    }
}
