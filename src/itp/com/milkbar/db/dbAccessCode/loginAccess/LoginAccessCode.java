package itp.com.milkbar.db.dbAccessCode.loginAccess;

import itp.com.milkbar.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginAccessCode {

    public  String cashierLogin(String empId) throws SQLException, ClassNotFoundException {
        String userName = null;
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM user WHERE empId=? AND role='cashier'",empId);
        if (resultSet != null) {
            while (resultSet.next()) {
                return resultSet.getString("password");
            }
        }
        return null;
    }

    public String adminLogin(String empId) throws SQLException, ClassNotFoundException {
        String userName=null;
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM user WHERE empId=? AND role='manager'",empId);

        if(resultSet != null){
            while(resultSet.next()){
                return resultSet.getString("password");
            }
        }
        return null;
    }
}


