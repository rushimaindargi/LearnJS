package com.newspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_v1 {
    public static void main(String[] args) {

    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext_v1.xml");

    }

}
