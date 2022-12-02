package com.griddynamics.tech3camp.bean.lifecycle.presentation;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeanLifecyclePresentationApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(BeanLifecyclePresentationApplicationTests.class);

    @Autowired
    private PresentationComponent presentationComponent;

    @Test
    void contextLoads() {
        logger.info("Presentation component in use: {}", presentationComponent);
    }

}
