package com.Spring.Start.Lessons_11_Validation;

public class INFO {
    //TODO:     *************************************************
    //TODO:     * Мета: * Cтворити Validation для сутності book *
    //TODO:     *************************************************
    //TODO:     Validation - Для початку!!! Підключемо dependency
    //TODO:
    //TODO:         <dependency>
    //TODO:	        	<groupId>org.hibernate.validator</groupId>
    //TODO:		        <artifactId>hibernate-validator</artifactId>
    //TODO:		        <version>6.1.5.Final</version>
    //TODO:	        </dependency>
    //TODO:
    //TODO:	        <dependency>
    //TODO:		        <groupId>javax.validation</groupId>
    //TODO:		        <artifactId>validation-api</artifactId>
    //TODO:		        <version>2.0.1.Final</version>
    //TODO:	        </dependency>
    //TODO:
    //TODO:     ------------------------------------------------------------------------------------
    //TODO:     Validation - це специфікація яка встановляється для нанесення критерій на ввід даних
    //TODO:     @NotBlank  - провіряє поле на null (можна вивести сповіщення, якщо null)
    //TODO:     @Size - задаэмо границі строки мараметрами min та max
    //TODO:     message - параметр, який присутній буквально в усіх анотаціях спеціфікації validation
    //TODO:                 ним можна встановлювати сповіщення @NotBlank(message="...")
    //TODO:     ------------------------------------------------------------------------------------
    //TODO:     По даный структуры ми підключаємо validation до метода(Post,Get,Put)
    //TODO:
    //TODO:     @Valid Book book - включаэ validation в методі
    //TODO:     Errors errors    - містить у собі помилки при validation
    //TODO:
    //TODO:     if(errors.hasErrors) {
    //TODO:          return "UI";    }
    //TODO:
    //TODO:     Далі переходими на UI і підставляємо в структуру UI в Post метод
    //TODO:
    //TODO:     <span class="validationErrors"
    //TODO:           th:if="${#fields.hasErrors('author')}"
    //TODO:            th:errors="*{author}">
    //TODO:     </span>
}
