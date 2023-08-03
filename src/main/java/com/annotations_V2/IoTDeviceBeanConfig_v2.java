package com.annotations_V2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = " com.annotations")
public class IoTDeviceBeanConfig_v2 {

    /*
    @Bean
    public IoTDevice IoTDevice() {
        System.out.println("Inside IoTDevice config");
        return new IoTDevice();
    }
    */

    @Bean(name = "firstBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IoTDevice_v2 firstIoTDevice() {
        System.out.println("Inside 1st IoTDevice config");
        IoTDevice_v2 device = new IoTDevice_v2();
        device.setDevice("Refrigerator");
        device.setDescription("Temp monitor");
        return device;
    }

    @Bean(name = "secondBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IoTDevice_v2 secondIoTDevice() {
        System.out.println("Inside 2nd IoTDevice config");
        IoTDevice_v2 device = new IoTDevice_v2();
        device.setDevice("New Refrigerator");
        device.setDescription("New Temp monitor");
        return device;
    }
}
