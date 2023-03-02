package com.example.business;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

public class EmployeeStockPlan {
    public int grant = 10;
    public int grantStock(Employee e){
        if (e instanceof Director)      grant = 1000;
        else if (e instanceof Manager)  grant = 100;
        return grant;
    }
}