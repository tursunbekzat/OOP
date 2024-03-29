package com.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.Counter;

public class ThreadInterrupted {

    public static void main(String[] args) {
        Runnable r = new Counter();
        Thread t = new Thread(r);
        t.start();
        
        
        try(BufferedReader br = new BufferedReader (new InputStreamReader (System.in))) {
            br.readLine();
        } catch(IOException e) {}
        
        System.out.println("Thread is alive:" + t.isAlive());
        t.interrupt();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            t.interrupt();
        }
        
        System.out.println("Thread is alive:" + t.isAlive());
        
    }
}
