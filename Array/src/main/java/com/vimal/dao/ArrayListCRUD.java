package com.vimal.dao;

import com.vimal.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface ArrayListCRUD {

    void addData(Employee employee1, Employee employee2, Employee employee3);
    void showAllEmp();
    void findEmpById(int empId);
    void updateEmp(Employee employee);
    void deleteEmp(int empId);
}
