package com.annotations;

import org.springframework.stereotype.Component;

//@Component
public class IoTDevice {
        String device;
        String description;

    public IoTDevice() {
        System.out.println("Bean created successfully--");
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
    public void initBean(){
        System.out.println("Inside initBean Method. Bean Initialized successfully");
    }
    public void destroyBean(){
        System.out.println("Inside DestroyBean Method. Bean Destroyed successfully");
    }
    }


