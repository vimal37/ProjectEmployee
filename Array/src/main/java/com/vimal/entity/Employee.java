package com.vimal.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private String dept;

    public Employee() {
    }

    public Employee(int empId, String firstName, String lastName, String dept) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
    }


    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "com.vimal.entity.Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    //Update4
}
