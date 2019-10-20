/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Invisible
 */
public class Delete {
     Connection connection;
    public ResultSet deleteuser(int id)
    {
        String sql="Delete from userinfo where userid='"+id+"'";
        ResultSet rs1=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Projectdatabase;user=sa;password=123456";
            connection = DriverManager.getConnection(url);
            
            Statement statement = connection.createStatement();
            rs1=statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs1;
    }
    
    public ResultSet deletesupplier(int id)
    {
        String sql="Delete from supplier where supplierid='"+id+"'";
        ResultSet rs1=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Projectdatabase;user=sa;password=123456";
            connection = DriverManager.getConnection(url);
            
            Statement statement = connection.createStatement();
            rs1=statement.executeQuery(sql);
            
            
           
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs1;
    }
    
}
