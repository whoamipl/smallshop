package com.example.servletjspdemo.service;

import java.util.*;

import com.example.servletjspdemo.domain.Computer;

public class StorageService {


	private int id = 0;
	private Map<Computer, Integer> shopDb = new Map<Computer, Integer>() {
		@Override
		public int size() {
			return 0;
		}

		@Override
		public boolean isEmpty() {
			return false;
		}

		@Override
		public boolean containsKey(Object o) {
			return false;
		}

		@Override
		public boolean containsValue(Object o) {
			return false;
		}

		@Override
		public Integer get(Object o) {
			return null;
		}

		@Override
		public Integer put(Computer computer, Integer integer) {
			return null;
		}

		@Override
		public Integer remove(Object o) {
			return null;
		}

		@Override
		public void putAll(Map<? extends Computer, ? extends Integer> map) {

		}

		@Override
		public void clear() {

		}

		@Override
		public Set<Computer> keySet() {
			return null;
		}

		@Override
		public Collection<Integer> values() {
			return null;
		}

		@Override
		public Set<Entry<Computer, Integer>> entrySet() {
			return null;
		}
	};

	public Map<Computer, Integer> getShopDb() {
		return shopDb;
	}

	public void setShopDb(Map<Computer, Integer> shopDb) {
		this.shopDb = shopDb;
	}

	public void addComputer (String model, int ram, String cpu, int hdd, String gpu) {
		++id;
		this.shopDb.put(new Computer(model, ram, cpu, hdd, gpu),id);
	}
}
