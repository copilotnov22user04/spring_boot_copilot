package com.example.apcfss.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {

    //add 10 employees to the list  
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Raj", "IT", 10000));
        employees.add(new Employee(2, "Ravi", "IT", 20000));
        employees.add(new Employee(3, "Ram", "IT", 30000));
        employees.add(new Employee(4, "Raju", "IT", 40000));
        employees.add(new Employee(5, "Rakesh", "IT", 50000));
        employees.add(new Employee(6, "Rajesh", "IT", 60000));
        employees.add(new Employee(7, "Rajendra", "IT", 70000));
        employees.add(new Employee(8, "Rajkumar", "IT", 80000));
        employees.add(new Employee(9, "Rajasekhar", "IT", 90000));
        employees.add(new Employee(10, "Rajkumari", "IT", 100000));
        return employees;
    }
}
