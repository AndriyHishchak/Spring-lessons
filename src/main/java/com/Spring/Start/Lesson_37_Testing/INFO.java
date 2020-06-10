package com.Spring.Start.Lesson_37_Testing;

import com.Spring.Start.Lesson_37_Testing.Component.User;

public class INFO {
    //TODO:     *******************************
    //TODO:     *  Мета: * Розробити Testing  *
    //TODO:     *******************************
    //TODO:     Э 3 основних вита тестування
    //TODO:     Unit-testing - коли тестимо окрему функцію, окремий клас
    //TODO:     Интегреционноэ - тестимо взаємозвязок між частинами програм (приклад тестимо repository та service який використовує даний repository)
    //TODO:     Функцыональноэ - піднімаємо увесь проект на тестах і дивимось що воно робить
    //TODO:         ---------------------------------------------------------------------------------
    //TODO:     @Test - анотацыя яка позначаэ метот як test
    //TODO:     assert - test методи для писання tests
    //TODO:     assertTrue(String,boolean) - стандартний test method. Параметр String - прописуэмо логіку із вірним результатом в вигляді строки, яка відправиться, якщо тест поверне Fasle.
    //TODO:                                  Параметр boolean - утверження чи правлеьно выдпрацювала логіка.
    //TODO:     assertTrue(boolean) - аналог метода assertTrue, тільки тепер ми очікуємо False. Писати їх також необіхно, для правельноъ роботи метода.
    //TODO:     assertEquals(expected,boolean,delta) - expected очікуваний результат, boolean - логіка, delta - введення діапазону він результата логіки до delta. delta - вона необхідня для роботи із неточними результатами.
    //TODO:         ---------------------------------------------------------------------------------
    //TODO:     Заглушка - створюэться для того щоб можна було побязати зависимості які є у класі
    //TODO:     Mockito - static сlass який містить методи для роботи із тестами та створення заглушок
    //TODO:     Створення заглушки
    //TODO:     Language language;
    //TODO:     @Before - внідряємо заглушку ???
    //TODO:     @BeforeEach - внідряємо заглушку ???
    //TODO:     public void setUp(){
    //TODO:        language = Mockito.mock(Language.class);
    //TODO:        user = new User;
    //TODO:        user.setLanguage(language);}
    //TODO:         ---------------------------------------------------------------------------------
    //TODO:          @Test
    //TODO:         public void sayHello() {
    //TODO:         when(language.hello()).thenReturn("Seiner"); -- коли методод hello() запуститься він поверне строку
    //TODO:         user.sayHello(); // запустк метода який запустить метод language.hello()
    //TODO:         verify(language,times(1)).hello(); // провірка метода  hello() 1 раз із класу language
    //TODO:         }
    //TODO:         ---------------------------------------------------------------------------------
    //TODO:         Для роботи із Spring в тестах нам потррібні наступні анотації
    //TODO:         @RunWith(SpringRunner.class) - анотація нозначається над самим test class
    //TODO:         SpringRunner - клас який використовуэться для написання Test Spring
    //TODO:         @SpringBootTest(classes = SpringStartApplication.class) - анотація в яку ми передаємо Context для того щоб піднялися біни для опису test
    //TODO:         Встановлюэмо зависимість
    //TODO:         @Autowired
    //TODO:         private User userSpring;
    //TODO:         ---------------------------------------------------------------------------------
    //TODO:         Описуємо Spring test
    //TODO:         @Test
    //TODO:        public void sayHelloSpring() {
    //TODO:        assertTrue(userSpring.sayHello().equals("Hello"));
    //TODO:        assertFalse(userSpring.sayHello().equals("No Hello"));
    //TODO:         ---------------------------------------------------------------------------------
}