package com.Spring.Start.Lesson_29_WebSocket;

public class INFO {
    //TODO:     ******************************************************************
    //TODO:     *  Мета: * Створити WebSocket для спілкування клієнта та сервера *
    //TODO:     ******************************************************************
    //TODO:     WebSocket - протокол связі TCP-соидинения, призначений
    //TODO:              для обміну сообшениями між браузером та сервером у режимі реального часу
    //TODO:                 Використовується для створення чату.
    //TODO:     -------------------------------------------------------------------------------------
    //TODO:     Для початку добавляємо dependency WebSocket
    //TODO:         <dependency>
    //TODO:			    <groupId>org.springframework.boot</groupId>
    //TODO:		    	<artifactId>spring-boot-starter-websocket</artifactId>
    //TODO:	    		<version>2.3.0.RELEASE</version>
    //TODO: 		</dependency>
    //TODO:
    //TODO:		    <dependency>
    //TODO:			    <groupId>org.java-websocket</groupId>
    //TODO:		    	<artifactId>Java-WebSocket</artifactId>
    //TODO:	    		<version>1.5.1</version>
    //TODO: 		</dependency>
    //TODO:     ---------------------------------------------------------------------------------------------------------------------------------
    //TODO:                         ПИШЕМО КЛІЄНТ
    //TODO:     1. Create js code по створеню WebSocket на стороны клієнта
    //TODO:         Create app.js - у ньому описуэмо логіку на конект (onopen) та відправку повідамлення (send)
    //TODO:                     Спрацьовуватиме усе буде по нажатый кнопці Ping із js методом Ping()
    //TODO:                 function action(messages) - із логікою створення параграфа і внесення в нього даних
    //TODO:     ----------------------------------------------------------------------------------------------------------------------------------
    //TODO:     2. Create Templates PingPong - із полем на ведденя та кнопкою події
    //TODO:     ----------------------------------------------------------------------------------------------------------------------------------
    //TODO:                         ПИШЕМО СЕРВЕР
    //TODO:     3. Create Package Controller
    //TODO:         Create WebSocketController - описуэмо mapping визову Template PingPong
    //TODO:     -----------------------------------------------------------------------------------------------------------------------------------
    //TODO:     4. Create Package WebSocketHandler
    //TODO:         Create PongWebSocket extends TextWebSocketHandler
    //TODO:         TextWebSocketHandler - клас який данаэ методи для реалызації Handler
    //TODO:         Перевизнучаємо 2 метода
    //TODO:
    //TODO:         public void afterConnectionEstablished(WebSocketSession session)  - метотд на встановлення звяску із сокетом на стороні сервера
    //TODO:             session.sendMessage(new TextMessage("connection established")); - відправка
    //TODO:
    //TODO:         protected void handleTextMessage(WebSocketSession session, TextMessage message) - метод на відправлення повідомелння
    //TODO:            System.out.println(message.getPayload()); -- логг
    //TODO:            session.sendMessage(new TextMessage("Pong")); - створення та відправка
    //TODO:     -----------------------------------------------------------------------------------------------------------------------------------
    //TODO:     5. Create Package Config
    //TODO:         Create WebSocketConfig - конфыгураційний клас! У ньому ми створюємо bean PongWebSocket та реэстрували його
    //TODO:         @EnableWebSocket - підключення WebSocket в configure class
    //TODO:         @Bean
    //TODO:           public PongWebSocket pongWebSocket () { - Created bean PongWebSocket
    //TODO:           return new PongWebSocket();
    //TODO:
    //TODO:         Регіструэмо WebSocket щоб він спрацьовував по даному адресу
    //TODO:         public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
    //TODO:             webSocketHandlerRegistry.addHandler(pongWebSocket(),"/pong");
    //TODO:     -----------------------------------------------------------------------------------------------------------------------------------




}
