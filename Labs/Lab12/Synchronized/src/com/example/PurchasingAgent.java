/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author ayazhanbaltabayeva
 */
public class PurchasingAgent {
    
    public void purchase() {
        Store store = Store.getInstance();
        
        synchronized (store) {
            if (store.getShirtCount() > 0 && store.authorizeCreditCard("1234", 15.00)) {
                Shirt shirt = store.takeShirt();
                System.out.println("The shirt is ours");
                System.out.println(shirt);
            }else {
                System.out.println("No shirt for you");
            }
        }
    }
    
    public PurchasingAgent() {
        System.out.println("Creating a puchasing agent");
    }
    /*
    public PurchasingAgent() {
        Thread t = Thread.currentThread();
        System.out.println("Thread:" + t.getName() + "," + t.getId());
    }*/
}
