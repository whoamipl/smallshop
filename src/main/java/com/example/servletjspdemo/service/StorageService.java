package com.example.servletjspdemo.service;

import java.util.*;

import com.example.servletjspdemo.domain.Computer;

public class StorageService {

	private String model;
	private int ram;
	private String cpu;
	private int hdd;
	private String gpu;
	private int id = 0;
	private double price;
	Map<Integer, Computer> shopDB = new HashMap<Integer, Computer>();
	public Map<Integer, Computer> getShopDb() {
		return shopDB;
	}

	public void setShopDB(Map<Integer, Computer> shopDb) {
		this.shopDB = shopDB;
	}

	public void addComputer (String model, int ram, String cpu, int hdd, String gpu, double price) {
		++id;
		this.shopDB.put(id,new Computer(model, ram, cpu, hdd, gpu, price));
	}

	public Computer findComputerById(int id) {
		for (Map.Entry<Integer, Computer> entry : shopDB.entrySet()){
			if (entry.getKey() == id) {
				return entry.getValue();
			}
		}
		return null;
	}

}
