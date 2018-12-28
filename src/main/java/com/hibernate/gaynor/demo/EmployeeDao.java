package com.hibernate.gaynor.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    private SessionFactory sessionFactory;
    @Autowired
    public EmployeeDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void createEmployee(Employee employee){
        Session session = null;
        try {
            session = this.sessionFactory.openSession();
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }

    public List<Employee> getEmployee(){
        Session session = null;
        List<Employee> employee = null;
        try {

            session = this.sessionFactory.getCurrentSession();
            session.beginTransaction();
            Query query = session.createQuery("From Employee");
            employee = query.list();
            session.close();

        }catch (Exception e){
             e.printStackTrace();
        }
        return employee;
    }

    @SuppressWarnings("unchecked")
    public List<Employee> getEmployeeById(int id){
        Session session;
        List<Employee> employee = null;
        try {

            session = this.sessionFactory.getCurrentSession();
            session.beginTransaction();
            Query query = session.createQuery("From Employee where id= :id");
            query.setParameter("id", id);
            employee = query.list();
            session.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return employee;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Employee deleteEmployeeById(int id) {
        Employee employee = null;
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Query query = session.createQuery("DELETE from Employee where id= :id");
            query.setParameter("id", id);
            query.executeUpdate();
            session.close();
            // orange and blue
        }catch (Exception e){
            e.printStackTrace();
        }
        return  employee;
    }
}
