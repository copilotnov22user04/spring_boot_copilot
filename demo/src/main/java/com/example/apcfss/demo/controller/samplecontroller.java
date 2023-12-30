package com.example.apcfss.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.apcfss.demo.repo.Employee;
import com.example.apcfss.demo.repo.EmployeeRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping; // Add this import
import org.springframework.web.bind.annotation.PathVariable;

@RestController 
public class samplecontroller {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }   

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepo.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeRepo.getEmployees().stream().filter(emp -> emp.getId() == id).findFirst().get();
    }
    
    
}

