package com.newspring;

import com.spring.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IOTDevice myNewDevice = (IOTDevice) appContext.getBean("myBean");
        IOTDevice anotherBeanDevice = appContext.getBean("myBean" , IOTDevice.class);
        myNewDevice.setDevice("Fridge");
        myNewDevice.setDescription("Temp Gauge for Fridge");

//        System.out.println("Setting values in bean 1: "+myNewDevice);

        System.out.println("Defining type of bean in different way-- by passing two args to appContext.getBean(beanId, ClassName.class )");
       // IOTDevice anotherBeanDevice = appContext.getBean("myBean" , IOTDevice.class);
        anotherBeanDevice.setDevice("Heater");
        anotherBeanDevice.setDescription("Temp Sensor for Room");

        System.out.println("Setting values in bean 1: "+myNewDevice);
        System.out.println("another new bean "+anotherBeanDevice);

    }
}
