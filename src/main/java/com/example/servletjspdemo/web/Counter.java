package com.example.servletjspdemo.web;

public class Counter {

    private int counter = 0;

    synchronized public void incr() {
        counter++;
    }

    synchronized public int getCounter() {
        return counter;
    }
}
