package com.example;
import com.example.domain.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee user = new Employee();
        // Employee uesr2 = new Employee(3);
        // user.setEmpId(101);
        user.setName("Jane Smith");
        // user.setSsn ("012-34-5678");
        // user.setSalary(120_345.27);

        System.out.println ("Employee id:        " + user.getEmpId());
        System.out.println ("Employee name:      " + user.getName());
        System.out.println ("Employee Soc Sec #: " + user.getSsn());
        System.out.println ("Employee salary:    " + user.getSalary());
    }
}