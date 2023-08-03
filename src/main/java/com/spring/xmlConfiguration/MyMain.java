package com.spring.xmlConfiguration;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext_v3.xml");

//        MyIOTDevice bean1 = (MyIOTDevice) appContext.getBean("myIOTDeviceBean");
//        MyIOTDevice bean2 = (MyIOTDevice) appContext.getBean("myIOTDeviceBean2");
//
//        System.out.println("bean 1: "+bean1);
//        System.out.println("bean 2: "+bean2);


        System.out.println("Using parameterized constructor--");
        MyIOTDevice const1 = (MyIOTDevice) appContext.getBean("constructor1");
        MyIOTDevice const2 = (MyIOTDevice) appContext.getBean("constructor2");

        System.out.println();
        System.out.println("Constructor 1: "+const1);
        System.out.println("Constructor 2: "+const2);
        appContext.close();
    }
}
