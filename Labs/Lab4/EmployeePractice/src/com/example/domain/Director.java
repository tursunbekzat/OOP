package com.example.domain;

public class Director extends Manager {
    private double budget;
    public Director(String name, int empId, String ssn, double salary, String deptName, double budget){
        super(name, empId, ssn, salary, deptName);
        this.budget = budget;
    }

    public double getter(){
        return budget;
    }
    public void getInfo(){
        System.out.println(this.budget);
        System.out.println(this.deptName);
        System.out.println(super.getEmpId());
        System.out.println(super.getName());
        System.out.println(super.getSalary());
        System.out.println(super.getSsn());
    }
    @Override
    public String toString(){
        return  super.toString() + String.format("\nbudget - %s", getter());
    }
}
