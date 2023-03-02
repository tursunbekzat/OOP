package com.example.domain;

public class Manager extends Employee{
    String deptName;
    public Manager(String name, int empId, String ssn, double salary, String deptName){
        super(name, empId, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }


    public void getInfo(){
        System.out.println(this.deptName);
        System.out.println(super.getEmpId());
        System.out.println(super.getName());
        System.out.println(super.getSalary());
        System.out.println(super.getSsn());
    }
    @Override
    public String toString(){
        return  super.toString() + String.format("\ndeptName - %s", getDeptName());
    }
}
