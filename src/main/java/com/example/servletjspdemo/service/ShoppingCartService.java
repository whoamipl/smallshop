package com.example.servletjspdemo.service;


import com.example.servletjspdemo.domain.Computer;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartService {

    private HashMap<Integer, Computer> cartItems;

    public ShoppingCartService(){
        cartItems = new HashMap<>();
    }

    public HashMap getCartItems(){
        return cartItems;
    }

    public void addToCart(Integer counter, Computer computer){
        cartItems.put(counter, computer);
    }

    public void deleteFromCart(Integer itemId) {

        cartItems.remove(itemId);
    }

    public Computer getCartItemById(int id){
        for (Map.Entry<Integer, Computer> entry : cartItems.entrySet()) {
            if (entry.getKey() == id) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void deleteAll() {

        cartItems.clear();
    }
}