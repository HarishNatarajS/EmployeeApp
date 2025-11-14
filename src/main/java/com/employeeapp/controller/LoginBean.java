package com.employeeapp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {

    private String username;
    private String password;

    public String login() {
        if ("admin".equals(username) && "1234".equals(password)) {
            return "addEmployee.xhtml?faces-redirect=true";
        }
        return null;
    }

    // getters & setters
}
