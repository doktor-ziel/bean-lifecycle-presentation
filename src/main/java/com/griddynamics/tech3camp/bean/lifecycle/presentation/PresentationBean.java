package com.griddynamics.tech3camp.bean.lifecycle.presentation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PresentationBean implements InitializingBean, DisposableBean, AutoCloseable, BeanNameAware, ApplicationContextAware {

    private final Logger logger = LoggerFactory.getLogger(PresentationBean.class);

    {
        logger.info("Initialization block");
    }

    public PresentationBean() {
        logger.info("Constructor");
    }

    public void initMethod() {
        logger.info("initMethod");
    }

    public void destroyMethod() {
        logger.info("destroyMethod");
    }

    @Override
    public void close() throws Exception {
        logger.info("close");
    }

    @Override
    public void setBeanName(String name) {
        logger.info("setBeanName: {}", name);
    }

    @Override
    public void destroy() throws Exception {
        logger.info("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("setApplicationContext");
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }

    public void postProcessBeforeInitialization() {
        logger.info("postProcessBeforeInitialization");
    }

    public void postProcessAfterInitialization() {
        logger.info("postProcessAfterInitialization");
    }
}
