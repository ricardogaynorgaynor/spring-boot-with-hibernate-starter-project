package com.hibernate.gaynor.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "doj")
    private Date doj;
    @Column(name = "salary")
    private Double salary;

    public Employee() {

    }

    public Employee(String name, Date doj, Double salary) {
        this.name = name;
        this.doj = doj;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                ", salary=" + salary +
                '}';
    }
}
