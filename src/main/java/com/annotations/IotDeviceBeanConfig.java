package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = " com.annotations")
public class IotDeviceBeanConfig {

    /*@Bean
    public IoTDevice IoTDevice() {
        System.out.println("Inside IoTDevice config");
        return new IoTDevice();
    }*/

    @Bean(name = "firstBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IoTDevice firstIoTDevice() {
        System.out.println("Inside 1st IoTDevice config");
        return new IoTDevice();
    }

    @Bean(name = "secondBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IoTDevice secondIoTDevice() {
        System.out.println("Inside 2nd IoTDevice config");
        return new IoTDevice();
    }
}
