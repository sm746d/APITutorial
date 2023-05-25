package com.example.demo;

import org.springframework
        .stereotype
        .Repository;

import com.example.demo.Employees;

@Repository

public class EmployeeDAO{
    private static Employee list = new Employees();

    static{
        list.getEmployeeList().add(
            new Employee(1,
                "Shean",
                "Mish",
                "shan.mish@gmail.com"
            )
        );

        list.getEmployeeList().add(
            new Employee(2,
                "Sam",
                "Emanual",
                "sam.emanual@gmail.com"
            );
        )

        list.getEmployeeList().add(
            new Employee(3,
                "Ethan",
                "Hunt",
                "ethan.hunt@hotmail.com"
            )
        );

        public Employees getAllEmployees(){
            return list;
        }

        public void addEmployee(Employee employee){
            list.getEmployeeList().add(employee);
        }
    }
}