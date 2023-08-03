package com.annotations_V2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(IotDeviceBeanConfig.class);
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(IoTDeviceBeanConfig_v2.class);
        IoTDevice_v2 myFirstDeviceBean = (IoTDevice_v2) appContext.getBean("firstBean");
        IoTDevice_v2 mySecondDeviceBean = (IoTDevice_v2) appContext.getBean("secondBean");



        System.out.println("\nFirst Bean: "+myFirstDeviceBean);
        System.out.println("Second Bean: "+mySecondDeviceBean);

        System.out.println("");
        appContext.close();
    }


}
