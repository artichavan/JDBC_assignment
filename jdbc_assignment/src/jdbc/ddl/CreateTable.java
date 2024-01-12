package jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "Dipti@15";

        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        String createTableQuery="CREATE TABLE COURSE( COURSE_ID INT, COURSE_NAME VARCHAR(100), COURSE_DURATION VARCHAR(100) ,COURSE_FEES INT)";

        boolean isTableCreated=statement.execute(createTableQuery);
        connection.close();
        System.out.println("table is created"+isTableCreated);



    }
}
