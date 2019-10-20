/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Invisible
 */
public class Connect {
    public Connection connection;
      public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Projectdatabase;selectMethod=cursor", "sa", "123456");

            

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT username,position FROM Userinfo");
            
            
            while (resultSet.next()) {
                
                System.out.println("User Name  is:" + 
                        resultSet.getString("username")+"  "+resultSet.getString("position"));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
      
    
}
