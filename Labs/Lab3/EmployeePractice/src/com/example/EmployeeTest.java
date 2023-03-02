package com.example;

import com.example.domain.Admin;
import com.example.domain.Manager;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;

public class EmployeeTest {   
    
    static void printEmployee(Employee e) {
        System.out.println ();
        System.out.println ("Employee id:        " + e.getEmpId());
        System.out.println ("Employee name:      " + e.getName());
        System.out.println ("Employee Soc Sec #: " + e.getSsn());
        System.out.println ("Employee salary:    " + e.getSalary());
    }
    public static void main(String[] args) {
        Admin admin = new Admin("Jane Smith", 101,  "012-34-5678", 120_345.27);
        Engineer engineer = new Engineer("Jane Smith", 101,  "012-34-5678", 120_345.27);
        Manager manager = new Manager("Barbara Jhonson", 207, "054-12-2367", 109_501.36, "US Marketing");
        Director director = new Director("Susan Wheeler", 12, "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        printEmployee(admin);
        printEmployee(engineer);
        printEmployee(manager);
        printEmployee(director);
    }
}