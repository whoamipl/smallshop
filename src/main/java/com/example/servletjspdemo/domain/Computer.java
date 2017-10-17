package com.example.servletjspdemo.domain;

public class Computer {

    private String model;
    private int ram;
    private String cpu;
    private int hdd;
    private String gpu;

    public Computer(String model, int ram, String cpu, int hdd, String gpu) {
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.gpu = gpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
