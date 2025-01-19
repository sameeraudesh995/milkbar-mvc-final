package itp.com.milkbar.db.dbAccessCode.employee;

import itp.com.milkbar.model.Employee;
import itp.com.milkbar.util.CrudUtil;

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
        return CrudUtil.execute("INSERT INTO employee (emp_Id, name, email, address, salary) VALUES(?,?,?,?,?)",
                employee.getEmpId(),
                employee.getName(),
                employee.getEmail(),
                employee.getAddress(),
                employee.getSalary()
        );
    }

    public List<Employee> findAll() throws SQLException, ClassNotFoundException {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM employee");
        List<Employee> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(new Employee(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDouble(5))
            );
        }
        return list;
    }
}
