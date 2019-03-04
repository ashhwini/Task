package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("Bean has been destroyed");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean has been initialised");
    }
}
