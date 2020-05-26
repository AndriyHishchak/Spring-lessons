package com.Spring.Start.Lesson_21_WebFlux;

public class INFO {
    //TODO:     **************************************************
    //TODO:     * Мета: * Створити Rest-reactive-servise WebFlux *
    //TODO:     **************************************************
    //TODO:     Spring MVC - працює на Servlet в TomCat
    //TODO:     Spring WebFlux - працюэ в асинхронному режимі використовуючи контейнери (Natty - дефолт,Jetty,Undertow,Servlet 3.1 Container)
    //TODO:     Spring WebFlux - реактивний стек Spring. Він витримує куда більшу нагруску ніж стандартний стек
    //TODO:     Spring WebFlux - використовуэться для маштабированосты
    //TODO:     ----------------------------------------------------------------------------------
    //TODO:     ReactiveMongoRepository - клас для роботи із mongo Databases аналог CrudRepo тільки для реактивоного Spring
    //TODO:     Flux<...> - список (обгортка)
    //TODO:     Mono<...> - список обэктів елементів Databases ??? томущо ми користуэмося реактивним стеком
    //TODO:     @JsonIgnore - вказуэться в Entity class для того щоб не відображати дане поле позначено анотацією
    //TODO:     @ResponseStatus - повертаэ статус
    //TODO:     consumer = "application/json" - запрос знаэ що на вхыд получить json
    //TODO:     ----------------------------------------------------------------------------------
    //TODO:     Repo.saveAll(class).next(); - так зберыгаэмо в реактивному стуку
    //TODO:     @Delete Mono<ResponseEntity<Void>>
    //TODO:     Для видалення у реактивному стеку для початку потрібно витягнути і потім удалити
    //TODO:     Repo.findByName(name).flatMap(existingLenguage -> delete(existingLenguage)
    //TODO:      .then(Mono.just(new ResponseEntity<Void> HttpStatus.OK)))
    //TODO:      .defaultIfEmpty(new ResponseEntity<>HttpStatus.NOT_FOUND)); -- таким способом ми видаляэмо у рефктивному стеку
    //TODO:     ----------------------------------------------------------------------------------
    //TODO:     @Put - не заповнены поля позначить null
    //TODO:     @Patсh Mono<ResponseEntity<class>> - не заповнены поля залишить без змін
    //TODO:     для того щоб обновити потрыбно записати так
    //TODO:     Repo.findByName(name).flatMap(existingLenguage -> {
    //TODO:     if(class.getCreator() != null) existingLenguage.setCreator(Class.GetCreator());
    //TODO:     if(class.getFeature() !=null) existingLenguage.setFeature(Class.getFeature());
    //TODO:     return Repo.save(existingLenguage)
    //TODO:     }).map(updatedLanguage -> new ResponseEntity<>(updatedLanguage.HttpStatus.OK))
    //TODO:     .defaultIFEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    //TODO:     ??? - невпевнений у тверженні
    //TODO:     ----------------------------------------------------------------------------------


}
