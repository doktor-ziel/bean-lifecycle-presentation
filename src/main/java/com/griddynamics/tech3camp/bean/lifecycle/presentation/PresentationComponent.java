package com.griddynamics.tech3camp.bean.lifecycle.presentation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PresentationComponent implements InitializingBean, DisposableBean {

    private final Logger logger = LoggerFactory.getLogger(PresentationComponent.class);
    @Autowired
    @Qualifier("value1")
    private String field1;
    private String field2;
    private String field3;
    {
        logger.info("Initialization block: {}", this);
    }

    @Autowired
    public PresentationComponent(@Qualifier("value2") String field2) {
        this.field2 = field2;
        logger.info("Constructor: {}", this);
    }

    @Autowired
    public void setField3(@Qualifier("value3") String field3) {
        this.field3 = field3;
        logger.info("Setter: {}", this);
    }

    @Override
    public String toString() {
        return "PresentationComponent{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("afterPropertiesSet: {}", this);
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct: {}", this);
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy: {}", this);
    }

    @Override
    public void destroy() throws Exception {
        logger.info("destroy: {}", this);
    }
}
