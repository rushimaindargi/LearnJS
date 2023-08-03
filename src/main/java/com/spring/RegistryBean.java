package com.spring;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class RegistryBean {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");

        BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanReader = new XmlBeanDefinitionReader(beanFactory);
        beanReader.loadBeanDefinitions(resource);

        IOTDevice myDevice = (IOTDevice) ((DefaultListableBeanFactory)beanFactory).getBean("myIOTDeviceBean");

        System.out.println("Bean from BeanDefinitionRegistry Registry -- "+myDevice);


        //Just to avoid ClassCasting og beanRegistry
        DefaultListableBeanFactory newBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader newBeanReader = new XmlBeanDefinitionReader(newBeanFactory);
        newBeanReader.loadBeanDefinitions(resource);

        IOTDevice myNewDevice = (IOTDevice) newBeanFactory.getBean("myIOTDeviceBean");

        System.out.println("NewBean from BeanDefinitionRegistry Registry without (DefaultListableBeanFactory) -- "+myNewDevice);


    }
}
