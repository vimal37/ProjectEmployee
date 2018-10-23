import java.util.ArrayList;
import java.util.List;

public class ArrayListCRUD {

    List<Employee> employees = (List <Employee>) new ArrayList<Employee>();



    public void addData(Employee employee1,Employee employee2,Employee employee3){
        employees.add( employee1 );
        employees.add( employee2 );
        employees.add( employee3 );
    }

    public void showAllEmp(){
        for(int i=0;i<employees.size();i++){
            System.out.println(employees.get( i ));
        }
    }

    public void findEmpById(int empId){
        for(int i=0;i<employees.size();i++){
            if(employees.get( i ).getEmpId() == empId){
                System.out.println(employees.get( i ));
            }
        }
    }

    public void updateEmp(Employee employee){
        for(int i=0;i<employees.size();i++){
            if(employees.get( i ).getEmpId() == employee.getEmpId()){
                employees.set( i,employee );
            }
        }
    }

    public void deleteEmp(int empId){
        for (int i=0;i<employees.size();i++ ){
            if(employees.get( i ).getEmpId() == empId){
                employees.remove( i );
            }
        }
    }
}
