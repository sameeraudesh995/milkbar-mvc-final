package itp.com.milkbar.db.dbAccessCode.user;

import itp.com.milkbar.model.User;
import itp.com.milkbar.util.CrudUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;


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

    public User find(String id) throws SQLException, ClassNotFoundException {
        ResultSet set = CrudUtil.execute("SELECT * FROM user WHERE empId=? ",id);
        if (set.next()) {
            return new User(
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5)
            );
        } else {
            return null;
        }
    }

    public boolean update(User u) throws SQLException, ClassNotFoundException {
        if(u.getUserName()!=null) {
            return CrudUtil.execute(
                    "UPDATE user SET  password=?, userName=?, role=? WHERE empId=?",
                    u.getPassword(),
                    u.getUserName(),
                    u.getRole(),
                    u.getEmpId()

            );
        }else {
            return CrudUtil.execute(
                    "UPDATE user SET userName=?, role=? WHERE empId=?",
                    u.getUserName(),
                    u.getRole(),
                    u.getEmpId()

            );
        }
    }
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("DELETE FROM user WHERE empId=?",id);
    }

}
