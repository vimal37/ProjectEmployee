public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee( 101,"FName1","LName1", "Admin" );
        Employee employee2 = new Employee( 102,"FName2","LName2", "IT" );
        Employee employee3 = new Employee( 103,"FName3","LName3", "HR" );
        ArrayListCRUD arrayListCRUD = new ArrayListCRUD();
        arrayListCRUD.addData( employee1,employee2,employee3 );
        arrayListCRUD.showAllEmp();
//        arrayListCRUD.findEmpById( 102 );
//        Employee employee = new Employee( 103,"FName33","LName33", "Finance" );
//        arrayListCRUD.updateEmp( employee );
//        arrayListCRUD.showAllEmp();
        arrayListCRUD.deleteEmp( 102 );
        arrayListCRUD.showAllEmp();
    }
}
