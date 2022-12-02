package com.griddynamics.tech3camp.bean.lifecycle.presentation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PresentationConfiguration {
    @Bean
    public PresentationBeanPostProcessor presentationBeanPostProcessor() {
        return new PresentationBeanPostProcessor();
    }
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public PresentationBean presentationBean() {
        return new PresentationBean();
    }

    @Bean("value1")
    public String value1(@Value("value-1") String value) {
        return value;
    }

    @Bean("value2")
    public String value2(@Value("value-2") String value) {
        return value;
    }

    @Bean("value3")
    public String value3(@Value("value-3") String value) {
        return value;
    }
}
