package com.hibernate.gaynor.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public void saveEmployee(){
        this.employeeDao.createEmployee(new Employee("Ricardo Gaynor", new Date(), 12.85));
    }

    @RequestMapping(value ="/get-all", method = RequestMethod.GET)
    public List<Employee> getAllemployee(){
        return this.employeeDao.getEmployee();
    }


    @GetMapping(value = "/employee/find/{id}")
    public List<Employee> getEmployeeById(@PathVariable int id){
        return this.employeeDao.getEmployeeById(id);
    }

    @GetMapping(value = "/employee/delete/{id}")
    public Employee deleteEmployeeById(@PathVariable int id){
        return this.employeeDao.deleteEmployeeById(id);
    }

}
