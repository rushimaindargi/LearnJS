package com.newspring;

public class NewIoTDevice_v1 {
    String device;
    String description;

    public NewIoTDevice_v1() {
        System.out.println("Bean created Successfully");
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
        return "NewIoTDevice_v1{" +
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
