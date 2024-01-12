package jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "Dipti@15";

        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        String updateQuery ="UPDATE COURSE SET COURSE_NAME='hibernate' WHERE COURSE_ID=3";
        statement.execute(updateQuery);
        connection.close();
        System.out.println("Record Updated successfully");





    }
}
