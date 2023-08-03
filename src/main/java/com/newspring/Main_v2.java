package com.newspring;

import com.spring.IOTDevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_v2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext_v2.xml");

        System.out.println("\nAbout to retrieve the instantiated beans...");
        NewIoTDevice_v1 myBean = (NewIoTDevice_v1) appContext.getBean("myBean");
        NewIoTDevice_v1 myBean2 = (NewIoTDevice_v1) appContext.getBean("myBean1");

        myBean.setDevice("First Device");
        myBean.setDescription("some description for First");

        myBean2.setDevice("Second Device");
        myBean2.setDescription("some description for Second");

        System.out.println("FirstBean: "+myBean);
        System.out.println("SecondBean: "+myBean2);

        appContext.close();
    }
}
