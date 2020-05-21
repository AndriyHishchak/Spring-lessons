package com.Spring.Start.lessons_15_Mail;

public class INFO {
    //TODO:     *************************************************
    //TODO:     *       Мета: * Зробити надсилання |Email|      *
    //TODO:     *************************************************
    //TODO:     @Autowired - анотація, яка підставляє bean
    //TODO:     @Bean - анотація, яка горорить, що це bean
    //TODO:     @Service - анотацыя, яка говорить, що це service
    //TODO:     @Configuration - анотацыя, яка говорить, що це Configuration
    //TODO:     -------------------------------------------------------------
    //TODO:     Interface MailSender - інтерфейс верхнього рівня, який надає основну функціональність для надсилання простих електронних листів
    //TODO:     Interface JavaMailSender - інтерфейс MailSender. Він піддтримує повідомлення Mine
    //TODO:     JavaMailSenderImpl - забеспечує реалізацію JavaMailSender
    //TODO:     SimpleMailMessage - Використовуэться для створення простого поштового повыдомлення
    //TODO:     Interface MineMessage - забеспечуэ інтерфейс зворотнього звяску  для підготовлення Mime-повідомлень
    //TODO:     MineMessageHelper - клас помічник MineMessage, містить підтримку зображень і так далі ...
    //TODO:     ------------------------------------------------------------
    //TODO:     1) Для початку втановимо dependency для Email
    //TODO:     <dependency>
    //TODO:		        <groupId>org.springframework.boot</groupId>
    //TODO:		        <artifactId>spring-boot-starter-mail</artifactId>
    //TODO:		        <version>2.3.0.RELEASE</version>
    //TODO:     	</dependency>
    //TODO:     --------------------------------------------------------------
    //TODO:     2)  Створюємо package Config.
    //TODO:         Створюємо Configuration class.
    //TODO:         Позначаэмо class анотацією @Configuration.
    //TODO:     --------------------------------------------------------------
    //TODO:     3)   Створюэмо @Bean JavaMailSender
    //TODO:
    //TODO:          @Bean
    //TODO:        public JavaMailSender javaMailSender() {
    //TODO:           JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    //TODO:             mailSender.setHost("smtp.gmail.com");
    //TODO:             mailSender.setPort(587);
    //TODO:
    //TODO:             mailSender.setUsername("Company@gmail.com");
    //TODO:             mailSender.setPassword("Password");
    //TODO:
    //TODO:             Properties properties = mailSender.getJavaMailProperties();
    //TODO:             properties.put("mail.transport.protocol","smtp");
    //TODO:             properties.put("mail.smtp.auth","true");
    //TODO:             properties.put("mail.smtp.starttls.enable","true");
    //TODO:             properties.put("mail.debug","true");
    //TODO:
    //TODO:                 return mailSender;
    //TODO:       }
    //TODO:    ------------------------------------------------------------------------
    //TODO:     4) Створюэмо package Service
    //TODO:        Створюэмо Service class EmailServiceImpl
    //TODO:
    //TODO:         @Autowired
    //TODO:         public JavaMailSender emailSender;
    //TODO:
    //TODO:         public void sendSimpleMessage(String subject,String text) {
    //TODO:
    //TODO:             SimpleMailMessage message = new SimpleMailMessage();
    //TODO:             message.setTo("admin@gmail.com");
    //TODO:             message.setSubject(subject);
    //TODO:             message.setText(text);
    //TODO:
    //TODO:             emailSender.send(message);
    //TODO:            }
    //TODO:     -------------------------------------------------------------------------

}
