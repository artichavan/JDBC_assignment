package jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "Dipti@15";

        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        String insertQuery ="INSERT INTO COURSE( COURSE_ID , COURSE_NAME , COURSE_DURATION  ,COURSE_FEES) VALUES (1,'CORE JAVA','5 MONTHS',6000)";
        statement.execute(insertQuery);
        connection.close();
        System.out.println("Record Inserted successfully");





    }
}
