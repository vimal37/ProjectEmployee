package com.vimal.Main;

import com.vimal.dao.ArrayListCRUD;
import com.vimal.dao.ArrayListCRUDImpl;
import com.vimal.entity.Employee;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee( 101,"FName1","LName1", "Admin" );
        Employee employee2 = new Employee( 102,"FName2","LName2", "IT" );
        Employee employee3 = new Employee( 103,"FName3","LName3", "HR" );
        ArrayListCRUD crudService = new ArrayListCRUDImpl();
        crudService.addData(employee1,employee2,employee3);
        crudService.showAllEmp();
//        arrayListCRUDImpl.findEmpById( 102 );
//        com.vimal.entity.Employee employee = new com.vimal.entity.Employee( 103,"FName33","LName33", "Finance" );
//        arrayListCRUDImpl.updateEmp( employee );
//        arrayListCRUDImpl.showAllEmp();
//        arrayListCRUDImpl.deleteEmp( 102 );
//        arrayListCRUDImpl.showAllEmp();
    }
}
