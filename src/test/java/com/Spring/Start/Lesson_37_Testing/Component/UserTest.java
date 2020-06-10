package com.Spring.Start.Lesson_37_Testing.Component;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringStartApplication.class)
class UserTest {

    private Language language;
    private User user;

    @Autowired
    private User userSpring;

    @BeforeEach
    public void setUp(){
       language = Mockito.mock(Language.class);
       user = new User();
       user.setLanguage(language);
    }

    @Test
    public void sayHelloSpring() {
        assertTrue(userSpring.sayHello().equals("Hello"));
        assertFalse(userSpring.sayHello().equals("No Hello"));
    }

    @Test
    public void sayHello() {
        when(language.hello()).thenReturn("Messages");
        user.sayHello();
        verify(language,times(1)).hello();
    }

    @Test
    void sum() {
        User user = new User();
        assertTrue(user.sum(2,3) == 5,
                   "2 + 3 = 5");
        assertFalse(user.sum(3,2)==10);
        assertEquals(2.2,(float)user.sum(0,2),0.5);
    }


}