package com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl {

    @Autowired
    public JavaMailSender emailSender;

    public void sendSimpleMessage(String subject,String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("admin@gmail.com");
        message.setSubject(subject);
        message.setText(text);

        emailSender.send(message);
    }
}
