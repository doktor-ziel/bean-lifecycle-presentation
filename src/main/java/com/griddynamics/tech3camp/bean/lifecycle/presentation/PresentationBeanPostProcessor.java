package com.griddynamics.tech3camp.bean.lifecycle.presentation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PresentationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof PresentationBean) {
            ((PresentationBean) bean).postProcessBeforeInitialization();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof PresentationBean) {
            ((PresentationBean) bean).postProcessAfterInitialization();
        }
        return bean;
    }
}
