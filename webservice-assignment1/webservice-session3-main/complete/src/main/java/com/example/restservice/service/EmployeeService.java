package com.example.restservice.service;

import com.example.restservice.model.Employee;
import com.example.restservice.model.City;
import com.example.restservice.model.Address;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees (){

        Employee employee1 = new Employee(1,"Alex",new Address(100,"Rose",
                new City("Mars","Qc"),"H1b1X2"));
        Employee employee2 = new Employee(2,"Dexter",new Address(200,"Grey",
                new City("Earth","On"),"H2a1a1"));
        Employee employee3 = new Employee(3,"Zoe",new Address(300,"Blank",
                new City("Moon","Qc"),"H3s1f2"));

     employees.add(employee1);
     employees.add(employee2);
     employees.add(employee3);

     return employees;
    }

    public Employee getById(int id){
        for(Employee e : employees) {
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
    public void addEmployee(Employee employee){employees.add(employee);}
}
