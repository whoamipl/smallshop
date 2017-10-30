package com.example.servletjspdemo.service;


import java.util.HashMap;

public class ShoppingCartService {

    HashMap<String, Double> cartItems;

    public ShoppingCartService(){
        cartItems = new HashMap<>();

    }

    public HashMap getCartItems(){
        return cartItems;
    }

    public void addToCart(String itemId, double price){
        cartItems.put(itemId, price);
    }

    public void deleteFromCart(String itemId) {

        cartItems.remove(itemId);
    }
}