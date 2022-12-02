package com.griddynamics.tech3camp.bean.lifecycle.presentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PresentationConfiguration {
    @Bean
    public PresentationBean presentationBean() {
        return new PresentationBean();
    }
}
