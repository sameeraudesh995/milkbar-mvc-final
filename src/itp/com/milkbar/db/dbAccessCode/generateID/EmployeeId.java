package itp.com.milkbar.db.dbAccessCode.generateID;

import itp.com.milkbar.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeId {
    public String getEmpId(String empId) throws SQLException, ClassNotFoundException {
        String lastid = null;
        ResultSet resultSet = CrudUtil.execute("SELECT emp_Id FROM employee ORDER BY emp_Id DESC LIMIT 1");
        if (resultSet != null) {
            while (resultSet.next()) {
                return resultSet.getString("emp_Id");
            }
        }
        return null;
    }
}
