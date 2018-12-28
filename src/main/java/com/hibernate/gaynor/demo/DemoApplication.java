package com.hibernate.gaynor.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

//    @Autowired
//    @Lazy
//    private EmployeeDao employeeDao;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

//    @Override
//    public void run(String... args) throws Exception {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate.cfg.xml");
//        EmployeeDao employeeDao  = (EmployeeDao) ctx.getBean("employeeDao");
//        employeeDao.createEmployee(this.getEmployee());
//    }
//
//    private Employee getEmployee(){
//         return new Employee("Ricardo Gaynor", new Date(), 23.12);
//    }
}

