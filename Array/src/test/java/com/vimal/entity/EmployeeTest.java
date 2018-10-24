package com.vimal.entity;

import com.vimal.config.ConfigTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;

public class EmployeeTest extends ConfigTest {

    @Autowired
    private Employee employee;

    @Test
    public void testEmpId() {
        employee.setEmpId( 1 );
        assertEquals( "EmpId is not correct", 1, employee.getEmpId() );
    }

    @Test
    public void testFirstName() {
        employee.setFirstName( "FirstName" );
        assertEquals( "FirstName is not correct", "FirstName", employee.getFirstName() );
    }

    @Test
    public void testLastName() {
        employee.setLastName( "LastName" );
        assertEquals( "LastName is not correct", "LastName", employee.getLastName() );
    }

    @Test
    public void testDept() {
        employee.setDept( "Dept" );
        assertEquals( "Dept is not correct", "Dept", employee.getDept() );
    }

    @Test
    public void tesToString() {
        Employee employee = new Employee( 1,"FirstName","LastName","Dept" );
        assertEquals( "ToString is not correct", "com.vimal.entity.Employee{empId=1, firstName='FirstName', lastName='LastName', dept='Dept'}", employee.toString() );
    }
}