package com.spring.xmlConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyIOTDevice {
    String device = "Air Conditioner";
    String description = "Temp Sensor";

    public MyIOTDevice(String device, String description) {
        this.device = device;
        this.description = description;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IOTDevice{" +
                "device='" + device + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    @PostConstruct
    public void initBean(){
        System.out.println("Inside initBean Method. Bean Initialized successfully");
    }
    @PreDestroy
    public void destroyBean(){
        System.out.println("Inside DestroyBean Method. Bean Destroyed successfully");
    }
}
