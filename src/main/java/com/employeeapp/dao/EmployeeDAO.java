package com.employeeapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import main.java.com.employeeapp.model.Employee;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp);
        tx.commit();
        session.close();
    }

    public List<Employee> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Employee> list = session.createQuery("from Employee").list();
        session.close();
        return list;
    }
}
