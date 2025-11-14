package com.employeeapp.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.com.employeeapp.dao.EmployeeDAO;
import main.java.com.employeeapp.model.Employee;

@ManagedBean
@SessionScoped
public class EmployeeBean {

    private Employee employee = new Employee();
    private EmployeeDAO dao = new EmployeeDAO();

    public String save() {
        dao.addEmployee(employee);
        employee = new Employee();
        return "view.xhtml?faces-redirect=true";
    }

    public List<Employee> getEmployees() {
        return dao.getAll();
    }

    public Employee getEmployee() {
        return employee;
    }
}
