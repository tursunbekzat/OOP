package com.example.domain;

public class Employee {
    private int empId;
    final int NUM = 0;

    private String name;
    private String ssn;
    private double salary;

    public Employee(){}

    public Employee(String name, int empId, String ssn, double salary){
        this.name = name;
        this.empId = empId;
        this.ssn = ssn;
        this.salary = salary;
    }
    public Employee(int empId){
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseSalary(double increase) {
        this.salary -= increase;
    }
}
