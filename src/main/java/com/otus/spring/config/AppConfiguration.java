package com.otus.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.otus.spring.service.impl")
public class AppConfiguration
{
    @Bean
    public ReloadableResourceBundleMessageSource messageSource()
    {
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:/i18n/messages");
        messageSource.setCacheSeconds(1);
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
