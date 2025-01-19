package itp.com.milkbar.db.dbAccessCode.employee;

import itp.com.milkbar.model.Employee;
import itp.com.milkbar.util.CrudUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeAccessCode {
    public static String getEmpId() throws SQLException, ClassNotFoundException {
        String lastid = null;
        ResultSet resultSet = CrudUtil.execute("SELECT emp_Id FROM employee ORDER BY emp_Id DESC LIMIT 1");
        if (resultSet != null) {
            while (resultSet.next()) {
                return resultSet.getString("emp_Id");
            }
        }
        return null;
    }

    public  boolean employeeRegister(Employee employee) throws ClassNotFoundException, SQLException {
        return CrudUtil.execute("INSERT INTO employee (emp_Id, name, email, address, salary, status) VALUES(?,?,?,?,?,?)",
                employee.getEmpId(),
                employee.getName(),
                employee.getEmail(),
                employee.getAddress(),
                employee.getSalary(),
                employee.getStatus()
        );
    }

    public List<Employee> findAll() throws SQLException, ClassNotFoundException {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM employee WHERE status='Available'");
        List<Employee> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(new Employee(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDouble(5),
                    resultSet.getString(6))
            );
        }
        return list;
    }

    public Employee find(String id) throws SQLException, ClassNotFoundException {
        ResultSet set = CrudUtil.execute("SELECT * FROM employee WHERE emp_Id=? AND status='Available'",id);
        if (set.next()) {
            return new Employee(set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getDouble(5),
                    set.getString(6)
            );
        } else {return null;}
    }

    public boolean update(Employee employee) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "UPDATE employee SET name=?, email=?, address=?, salary=?, status=? WHERE emp_Id=?",
                employee.getName(),
                employee.getEmail(),
                employee.getAddress(),
                employee.getSalary(),
                employee.getStatus(),
                employee.getEmpId()
        );
    }
    public boolean delete(Employee employee) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute(
                "UPDATE employee SET name=?, email=?, address=?, salary=?, status=? WHERE emp_Id=?",
                employee.getName(),
                employee.getEmail(),
                employee.getAddress(),
                employee.getSalary(),
                employee.getStatus(),
                employee.getEmpId()
        );
    }
}
