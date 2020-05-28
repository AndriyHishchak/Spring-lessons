package com.Spring.Start.Lesson_25_Authorization_and_Authentication;

public class INFO {
    //TODO:     ************************************
    //TODO:     *  Мета: * Створити authorization та roles *
    //TODO:     ************************************
    //TODO:     Authorization - это не то же самое что идентификация и аутентификация
    //TODO:     идентификация — это называние лицом себя системе
    //TODO:     аутентификация — это установление соответствия лица названному им идентификатору
    //TODO:     авторизация — предоставление этому лицу возможностей в соответствие с положенными
    //TODO:                  ему правами или проверка наличия прав при попытке выполнить какое-либо действие
    //TODO:     ----------------------------------------------------------------------------------------------
    //TODO:     Для початку необхадно встановити dependency
    //TODO:
    //TODO:     JPA
    //TODO:     SECURIT-CONFIG SECURIT-WEB SECURIT-CORE
    //TODO:     THYMELEAF
    //TODO:     WEB
    //TODO:     LOMBOK
    //TODO:     ---------------------------------------------------------------------------------------
    //TODO:     1. Create model
    //TODO:         Create user implements UserDetails - сутність user
    //TODO:         UserDetails - надаэ додатковы методи для опису user
    //TODO:         Create Enum Role -  перелік ролей
    //TODO:         Create UserDTO - клас який створюэться на основы User і використовується у подальшій логіці
    //TODO:     ------------------------------------------------------------------------------------------------
    //TODO:     2. Create Repo
    //TODO:         Create interface UserRepo extends CrudRepository - інтерфейс який містить стандартні методи із CrudRepository
    //TODO:     --------------------------------------------------------------------------------------------------
    //TODO:     3. Create Service
    //TODO:         Create UserService implements UserDetailsService - уся логіка яка необіхна для регыстрації user
    //TODO:         UserDetailsService - клас який надаэ метотд loadUserByUsername
    //TODO:         loadUserByUsername - метод який аундинтифікує user
    //TODO:     ---------------------------------------------------------------------------------------------------
    //TODO:     4. Create Config
    //TODO:         Create SecurityConfig extends WebSecurityConfigurerAdapter
    //TODO:         WebSecurityConfigurerAdapter - надаэ такі методи як :
    //TODO:             protected void configure(AuthenticationManagerBuilder auth) - у ньому ми прописуэмо шифруванн паролю
    //TODO:                  auth.userDetailsService(userDetailsService).passwordEncoder(encoder());
    //TODO:
    //TODO:              protected void configure(HttpSecurity http) - у нььому ми прописуэмо усю Security configuration
    //TODO:                      .antMatchers( "/registration","*/static/**","*/activate/*","/").permitAll() -- доступны сторінки усім ролям
    //TODO:                .anyRequest().authenticated() -- усі інші не доступні
    //TODO:                .and()
    //TODO:                .formLogin()
    //TODO:                .loginPage("/login").permitAll()
    //TODO:                .failureForwardUrl("/") -- форма логіна по даному url та доступ на старнову сторніку
    //TODO:                .and()
    //TODO:                .logout().logoutUrl("/logout").logoutSuccessUrl("/").permitAll(); -- форма логаута по даному url та доступ на старнову сторніку
    //TODO:     --------------------------------------------------------------------------------------------------------------------------------------------
    //TODO:     5. Create Controller
    //TODO:         Create RegistrationController - контролей для регістрації
    //TODO:         Create IndexController - контроллер головних сторінок
    //TODO:     -----------------------------------------------------------------------------------------------------------------
    //TODO:     6. Create templates
    //TODO:         Create login - сторінка аундинтифікації
    //TODO:         Create registration - сторынка регістраціъ
    //TODO:         Create index - головна сторынка
    //TODO:         UserPage - користувацька сторынка
    //TODO:         AdminPage - адмінська сторінка
    //TODO:     ------------------------------------------------------------------------------------------------
    //TODO:     Anotations model :
    //TODO:     ****************
    //TODO:     @Entity - створення сутності в базі даних
    //TODO:
    //TODO:     @Id()
    //TODO:     @GeneratedValue(strategy = GenerationType.IDENTITY) - створення первиного ключа із IDENTITY генерацією
    //TODO:
    //TODO:     @Column(name = "username", unique = true) - нава поляв в таблиці, а unique = true - значення унікальне і не може повторятися
    //TODO:
    //TODO:     @Enumerated(EnumType.STRING) - звернення до enam по типу String
    //TODO:     @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    //TODO      @CollectionTable(name = "roles") - створення промыжноъ таблицы
    //TODO:
    //TODO:     Anotations controller :
    //TODO:     ****************
    //TODO:     @Controller - це контролер (роутер url)
    //TODO:     @AuthenticationPrincipal - забеспечує узяття даних із куків про user
    //TODO:     @GetMapping("/") - Get метод
    //TODO:     @PostMapping - Post метод
    //TODO:     @PreAuthorize(value = "hasAuthority('USER') or hasAuthority('ADMIN')") - даний мапінг дозволений даним ролям
    //TODO:
    //TODO:     Anotations config :
    //TODO:     ****************
    //TODO:     @Configuration - конфігурація
    //TODO:     @EnableWebSecurity - підключення security
    //TODO:     @EnableGlobalMethodSecurity(prePostEnabled = true) - відкриття доступу до url по ролям
    //TODO:     @Bean - створення  та опису bean
    //TODO:     ------------------------------------------------------------------------------------------------------------------------
   



}
