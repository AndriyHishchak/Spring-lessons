package com.Spring.Start.lessons_6_JPA;

public class INFO {
    //TODO:     ***********************************************
    //TODO:     * Мета: * Створити таблиці та звяски між ними *
    //TODO:     ***********************************************
    //TODO:     JPA - [ JAVA PERSISTENCE API ]
    //TODO:     [ JAVA PERSISTENCE API ] - спеціфікація API Java EE, представляюча можливысть зберігати
    //TODO:                                 в удобному вигляді Java-object on Database.
    //TODO:     ------------------------------------------------------------------------------
    //TODO:     @Entity - ця анотація створює із сутності таблицю в databases
    //TODO:     @Table  - ця анотація встановлює імя для таблиці
    //TODO:     @Id     - ця анотація гооврить що це поле ключ
    //TODO:     @GeneratedValue - це під анотація @ID. Яка говорить якою стратегыэю буде генеруватись поле ключ.
    //TODO:         Э 4 стратегії   - AUTO     - по настройкам database
    //TODO:                           IDENTITY - (стандартна авто-інкрементація)
    //TODO:                           SEQUENCE - створення таблиці із полем sequence, яке буде використовуватися для генерації id
    //TODO:                           TABLE    - створення таблиці із полем sequence, яке буде використовуватися для генерації id
    //TODO:     -------------------------------------------------------------------------------------------------------------------
    //TODO:     @ManyToOne - звязок багато до одного
    //TODO:     @OneToMany - звязок один до багатьох
    //TODO:     @ManyToMany - звязок багато до багатьох
    //TODO:     @ManyToMany(mappedBy("...")) - встановлюэ імя таблиці (зазвичай для двухсторонньої связі)
    //TODO:     @Enumerated - анотацыя обозначаэ що даний обэкт э Enam (Enam у базы даних зберыгаэться по індексах)
    //TODO:     @Enumerated(EnumType = String) - зберыгаэ по значеню, а не по індексах
    //TODO:     @Embeddable - ця анотація вставляє даний клас у клас уякому пристній обєкт цього класу
    //TODO:     @Transient - говорить що не потрібно зберігати дане поле в базу даних
    //TODO:     @JoinTable - створення проміжної таблиці
    //TODO:     @JoinColumn - відображення стовбців таблиці
    //TODO:     ---------------------------------------------------------------
    //TODO:     @JoinTable(name = "Gym_Onner",
    //TODO:            joinColumns = @JoinColumn(name = "gym_id"),
    //TODO:            inverseJoinColumns = @JoinColumn(name = "ownner_id"))
    //TODO:     --------------------------------------------------------------------------------------------------------------------------
    //TODO:     cascade = CascadeType.All     - якщо видалити даны ыз однієї таблиці, спільні дані цих даних видаляться і із інших таблиць
    //TODO:     cascade = CascadeType.DETACH  - якщо видалити даны ыз однієї таблиці, спільні дані цих даних видаляться і із інших таблиць
    //TODO:     cascade = CascadeType.MERGE   - якщо видалити даны ыз однієї таблиці, спільні дані цих даних видаляться і із інших таблиць
    //TODO:     cascade = CascadeType.PERSIST - якщо видалити даны ыз однієї таблиці, спільні дані цих даних видаляться і із інших таблиць
    //TODO:     cascade = CascadeType.REFRESH - якщо видалити даны ыз однієї таблиці, спільні дані цих даних видаляться і із інших таблиць
    //TODO:     cascade = CascadeType.REMOVE  - якщо видалити даны ыз однієї таблиці, спільні дані цих даних видаляться і із інших таблиць
    //TODO:     --------------------------------------------------------------------------------------------------------------------------
    //TODO:     @Data   - @Getter + @Setter
    //TODO:     @Getter - авто-генерація Getters
    //TODO:     @Setter - авто-генерація Setters
    //TODO:     -----------------------------------
}
