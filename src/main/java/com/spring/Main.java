package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        //Normal Java Object construction
        IOTDevice myDevice = new IOTDevice();

        System.out.println("Iot device initialized with constructor: "+myDevice);

        // Ioc Container - Bean Factory
        System.out.println("Spring IoC BeanFactory container---");
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        IOTDevice myNewDevice = (IOTDevice) beanFactory.getBean("myIOTDeviceBean");

        System.out.println("XmlBeanFactory (Deprecated) : "+myNewDevice);


    }
}
