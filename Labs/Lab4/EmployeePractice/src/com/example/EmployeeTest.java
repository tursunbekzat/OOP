package com.example;
 import com.example.domain.Admin;
  import com.example.domain.Manager;
  import com.example.domain.Director;
  import com.example.domain.Employee;
  import com.example.domain.Engineer;
 import com.example.business.EmployeeStockPlan;

public class EmployeeTest {
    public static void main(String[] args) {
        Admin admin = new Admin("Jane Smith", 101,  "012-34-5678", 120_345.27);
        Engineer engineer = new Engineer("Jane Smith", 101,  "012-34-5678", 120_345.27);
        Manager manager = new Manager("Barbara Jhonson", 207, "054-12-2367", 109_501.36, "US Marketing");
        Director director = new Director("Susan Wheeler", 12, "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        EmployeeStockPlan stockPlan = new EmployeeStockPlan();
         EmployeeStockPlan stockPlanAdmin = new EmployeeStockPlan();
         EmployeeStockPlan stockPlanEngineer = new EmployeeStockPlan();
         EmployeeStockPlan stockPlanManager = new EmployeeStockPlan();
         EmployeeStockPlan stockPlanDirector = new EmployeeStockPlan();

        printEmployee(admin);
        printEmployee(engineer);
        printEmployee(manager);
        printEmployee(director);

        printEmployee(admin, stockPlan);
        printEmployee(engineer, stockPlan);
        printEmployee(manager, stockPlan);
        printEmployee(director, stockPlan);
    }
    static void printEmployee(Employee e) {
        System.out.println("Employee type: " + e.getClass().getSimpleName());
        System.out.println(e.toString());
    }
    static void printEmployee(Employee e, EmployeeStockPlan eStockPlan) {
        printEmployee(e);
        System.out.println("Stock Options: " + eStockPlan.grantStock(e));
    }
}