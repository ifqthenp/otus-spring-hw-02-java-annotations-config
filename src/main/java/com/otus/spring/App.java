package com.otus.spring;

import com.otus.spring.config.AppConfiguration;
import com.otus.spring.service.QuizService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        QuizService quizService = context.getBean(QuizService.class);

        quizService.run();
    }
}
