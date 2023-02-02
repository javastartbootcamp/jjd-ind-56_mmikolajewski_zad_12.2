public class Employee {

    private String firstName;
    private String lastName;
    private String id;
    private String departmentName;
    private double salary;

    public Employee(String firstName, String lastName, String id, String departmentName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.departmentName = departmentName;
        this.salary = salary;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName +
                ", id" + id +
                ", departmentName " + departmentName +
                ", salary " + salary + "zł";
    }
}
