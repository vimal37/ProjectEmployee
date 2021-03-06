public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private String dept;

    public Employee(int empId, String firstName, String lastName, String dept) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
    }
    public Employee(){}

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

}
