package com.Spring.Start.Lesson_36_Internationalization;

import org.springframework.web.bind.annotation.GetMapping;

public class INFO {
    //TODO:     ******************************************************************************
    //TODO:     *  Мета: * Зробити Internationalization сайт, щоб він підтримува різны мови  *
    //TODO:     ******************************************************************************
    //TODO:     LocaleResolver - інтерфейс який використовують для конфігурації Local
    //TODO:     WebMvcConfigurer - інтерфейс який предоставляє методи для роботи із web
    //TODO:         addInterceptors - метод інтерфейса addInterceptors. Використовується для встановлення Local
    //TODO:     LocaleChangeInterceptor - перехватуэ встановлення локалы та допомагаэ в методі addInterceptors її встановити
    //TODO:     -------------------------------------------------------------------------------------
    //TODO:     1) Create resources + new file + resources bandle
    //TODO:         Create local_uk.properties
    //TODO:
    //TODO:         Записуэмо потрібні  данаді із потрібною Local у file local_uk.properties
    //TODO:         title = Вітання
    //TODO:
    //TODO:     --------------------------------------------------------------------------------------------
    //TODO:     2) Create package conf
    //TODO:         Create class Internationalization implement WebMvcConfigurer
    //TODO:
    //TODO:     Create cookie які будуть місттити в собі встановлену локаль а також її переписувати
    //TODO:     @Bean
    //TODO:     public LocaleResolver localeResolver() {
    //TODO:     CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
    //TODO:     cookieLocaleResolver.setDefaultLocale(new Locale("en"));
    //TODO:     cookieLocaleResolver.setCookieName("language");
    //TODO:     return cookieLocaleResolver;
    //TODO:     }
    //TODO:
    //TODO:     метод для встановлення локалі
    //TODO:     @Override
    //TODO:     public void addInterceptors(InterceptorRegistry registry) {
    //TODO:     registry.addInterceptor(localeChangeInterceptor());
    //TODO:     }
    //TODO:
    //TODO:     перехват встановлення локалі та допомога її встановити
    //TODO:     @Bean
    //TODO:     public LocaleChangeInterceptor localeChangeInterceptor() {
    //TODO:     return new LocaleChangeInterceptor();
    //TODO:     }
    //TODO:
    //TODO:     -------------------------------------------------------------------------------------------------
    //TODO:     3) Create package Controller
    //TODO:         Create class controller
    //TODO:
    //TODO:      @GetMapping
    //TODO:       public String index() {
    //TODO:          return "index_36"; }
    //TODO:
    //TODO:      ------------------------------------------------------------------------------------
    //TODO:      4) Create Templates
    //TODO:      <h1 th:text="#{title}"></h1>
    //TODO:
    //TODO:      <div>
    //TODO:         <a th:href="@{'?locale=de'}">DE</a>
    //TODO:         <a th:href="@{'?locale=ru'}">RU</a>
    //TODO:         <a th:href="@{'?locale=uk'}">UK</a>
    //TODO:         <a th:href="@{'?locale=en'}">EN</a>
    //TODO:
    //TODO:      </div>
    //TODO:      ----------------------------------------------------------------------------------------------

}
