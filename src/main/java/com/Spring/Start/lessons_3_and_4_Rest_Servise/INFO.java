package com.Spring.Start.lessons_3_and_4_Rest_Servise;

public class INFO {
    //TODO:     МЕТА: побудувати стандартний Rest Service
    //TODO:     *****************************************
    //TODO:     REST - це структура із Http запитами (GET,PUT,POST,DELETE,PATCH)
    //TODO:     @RestController - позволяэ нам процювати тільки із json format without UI
    //TODO:     @RequestMapping - указує шлях для Mapping по url
    //TODO:     @RequestMapping(value={"/api",produces="application/json"}) - говорить про те що даний конроллер
    //TODO:                 працюэ по url /api і повертає json format
    //TODO:     --------------------------------------------------------------------------------------
    //TODO:     ResponseEntity<param1 OBJECT,param2 STATUS> - використовуэться для відавання коду статусу запита
    //TODO:     HttpStatus.OK - status 200
    //TODO:     HttpStatus.NOT_FOUND - не знайдено
    //TODO:     HttpStatus.NO_CONTENT - нычого не повертаэ
    //TODO:     @ResponseStatus - анотація у якій указуємо статус для констролера
    //TODO:     ----------------------------------------------------------------------------
    //TODO:     Optional<Book> -
    //TODO:             is.Present - якщо існує
    //TODO:     ------------------------------------------------------------------------------
    //TODO:     @GetMapping() - запит для повернення даних
    //TODO:     @PostMapping(consumes = "application/json"") - створюємо ресурс який буде чеканти json
    //TODO:     @PutMapping - запит на зміну усіх даних, в противному випадку дані які не вказалися задаються по дефолту null
    //TODO:     @PatchMapping - запит на зміну будь яких даних
    //TODO:     @DeleteMapping - запит на видалення даних
    //TODO:     @RequestBody - анотацыя яка конвертуэ json в обэкт
    //TODO:     @PathVariable("id") Long id - анотація яка створює змінну для контролера і підставляє дані
}
