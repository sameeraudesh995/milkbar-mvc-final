package itp.com.milkbar.db.dbAccessCode.user;

import itp.com.milkbar.model.Employee;
import itp.com.milkbar.model.User;
import itp.com.milkbar.util.CrudUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserAccessCode {

    public ObservableList<String> getAllEmployeeIds() throws ClassNotFoundException, SQLException {

        ResultSet resultSet = CrudUtil.execute("SELECT emp_Id FROM employee WHERE status='Available'");

        ObservableList<String> employeeIds = FXCollections.observableArrayList();

        while (resultSet.next()) {
            employeeIds.add(resultSet.getString(1));
        }

        return employeeIds;
    }


    public  boolean userRegister(User user) throws ClassNotFoundException, SQLException {
        return CrudUtil.execute("INSERT INTO user (empId, password, userName, role) VALUES(?,?,?,?)",
                user.getEmpId(),
                user.getPassword(),
                user.getUserName(),
                user.getRole()
        );
    }
}
