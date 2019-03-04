package com.stackroute.task;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        applicationContext.registerShutdownHook();
        Movie movie = (Movie)applicationContext.getBean("movie");
        System.out.println(movie.getActor());

    }
}
