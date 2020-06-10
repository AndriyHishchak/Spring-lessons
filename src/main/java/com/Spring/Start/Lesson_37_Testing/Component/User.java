package com.Spring.Start.Lesson_37_Testing.Component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    private Language language;

    public int sum (int a, int b) {
        return a + b;
    }

    public String sayHello() {
        return language.hello();
    }
    @Autowired
    public User(Language language) {
        this.language = language;
    }
    public User() {
    }
    public Language getLanguage() {
        return language;
    }


    public void setLanguage(Language language) {
        this.language = language;
    }
}
