package com.example.demo;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletURIComponentsBuilder;
// Import the above-defined classes
// to use the properties of those
// classes

import com.example.demo.Employee;
import com.example.demo.EmployeeDAO;
import com.example.demo.Employees;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController{
    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping(
    path="/",
    produces="application/json")

    public Employee getEmployees(){
        return EmployeeDAO.getAllEmployees();
    }

    @PostMapping(
        path = "/",
        consumes = "application/json",
        produces = "application/json"
    )

    
}
