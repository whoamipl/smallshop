package com.example.servletjspdemo.service;

import java.util.*;

import com.example.servletjspdemo.domain.Computer;

public class StorageService {


	private int id = 0;
	Map shopDB = new HashMap<Integer, Computer>();
	public Map<Integer, Computer> getShopDb() {
		return shopDB;
	}

	public void setShopDB(Map<Integer, Computer> shopDb) {
		this.shopDB = shopDB;
	}

	public void addComputer (String model, int ram, String cpu, int hdd, String gpu) {
		++id;
		this.shopDB.put(id,new Computer(model, ram, cpu, hdd, gpu));
	}



}
