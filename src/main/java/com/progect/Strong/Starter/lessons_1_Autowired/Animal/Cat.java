package com.progect.Strong.Starter.lessons_1_Autowired.Animal;

import com.progect.Strong.Starter.lessons_1_Autowired.Service.AnimalSound;

public class Cat implements AnimalSound {
    @Override
    public String sound() {
        return "moaw";
    }
}
