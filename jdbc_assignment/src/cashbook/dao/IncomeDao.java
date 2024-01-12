package cashbook.dao;

import cashbook.entities.Income;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncomeDao {
    public void addIncome(Income income){
        String url="jdbc:mysql://localhost:3306/cashbook";
        String username="root";
        String password="Dipti@15";
        Connection connection=null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            String insertQuery = "INSERT INTO Income(title,amount,date,notes)values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, income.getTitle());
            preparedStatement.setInt(2, income.getAmount());
            preparedStatement.setDate(3, income.getDate());
            preparedStatement.setString(4, income.getNotes());
            preparedStatement.executeUpdate();
        }
        catch (SQLException i){
            System.out.println("connection issue");
        }finally {
            try {
                connection.close();
            }catch (SQLException e){
                System.out.println("error in closing the connection");
            }
        }
    }
}
