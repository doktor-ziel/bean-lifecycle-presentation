package com.griddynamics.tech3camp.bean.lifecycle.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PresentationBean {

    private Logger logger = LoggerFactory.getLogger(PresentationBean.class);

    {
        logger.info("Initialization block");
    }

    public PresentationBean() {
        logger.info("Constructor");
    }

}
