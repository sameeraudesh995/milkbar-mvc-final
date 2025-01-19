package itp.com.milkbar.view.tm;

public class EmployeeTM {

    private String empId;
    private String name;
    private String email;
    private String address;
    private double salary;

    public EmployeeTM() {
    }

    public EmployeeTM(String empId, String name, String email, String address, double salary) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
