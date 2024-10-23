package com.firstapp.example.First_spring_app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
   private int empId;
   private String empName;
   private String empEmail;
    //here data type for address is Address which is the class we created for address
    private Address address;

    //create getter and setter

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Address getAddress() {
        return address;
    }
    @Autowired   // it is creating the object internally inside the ioc container
    public void setAddress(Address address) {
        this.address = address;
    }
}
