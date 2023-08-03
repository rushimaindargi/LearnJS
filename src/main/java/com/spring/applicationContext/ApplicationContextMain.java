package com.spring.applicationContext;

import com.spring.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        IOTDevice myDevice = (IOTDevice) appContext.getBean("myIOTDeviceBean");

        System.out.println("Bean from Application Context: "+myDevice);

    }
}
