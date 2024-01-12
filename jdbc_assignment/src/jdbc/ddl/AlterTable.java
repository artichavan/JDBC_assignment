package jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String password="Dipti@15";

        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        String alterTableQuery="ALTER TABLE COURSE MODIFY COLUMN COURSE_ID INT auto_increment";
        //true:if first object is resultSet otherwise false
        boolean isTableCreated=statement.execute(alterTableQuery);
        connection.close();
        System.out.println("table is alter");

    }
}
