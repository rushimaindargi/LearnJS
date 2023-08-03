package com.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(IotDeviceBeanConfig.class);
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(IotDeviceBeanConfig.class);
        IoTDevice myFirstDeviceBean = (IoTDevice) appContext.getBean("firstBean");
        IoTDevice mySecondDeviceBean = (IoTDevice) appContext.getBean("secondBean");

        myFirstDeviceBean.setDevice("Refrigerator");
        myFirstDeviceBean.setDescription("Temp monitor");

        mySecondDeviceBean.setDevice("Another Refrigerator");
        mySecondDeviceBean.setDescription("new Temp monitor");


        System.out.println("\nFirst Bean: "+myFirstDeviceBean);
        System.out.println("Second Bean: "+mySecondDeviceBean);

        System.out.println("");
        appContext.close();
    }


}
