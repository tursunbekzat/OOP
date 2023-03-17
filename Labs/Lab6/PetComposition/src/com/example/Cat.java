package com.example;

public class Cat extends Animal implements Pet {
    
    private String name;
    private Nameable nameable = new NameableImpl(); 
    private Ambulatory ambulatory;
    
    public Cat() {
        this("Fluffy");
        this.ambulatory = new AmbulatoryImpl(8);
    }
    
    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }
    
}