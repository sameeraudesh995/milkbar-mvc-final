package itp.com.milkbar.model;

public class User {
    private String empId;
    private String password;
    private String userName;
    private String role;

    public User() {
    }

    public User( String empId, String password, String userName, String role) {
        this.empId = empId;
        this.password = password;
        this.userName = userName;
        this.role = role;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                ", empId='" + empId + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
