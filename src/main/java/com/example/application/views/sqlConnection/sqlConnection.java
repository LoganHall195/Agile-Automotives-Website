package com.example.application.views.sqlConnection;
import java.sql.Statement;
import  java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.ResultSet;
import  java.sql.SQLException;

import org.springframework.stereotype.Component;
@Component
public class sqlConnection {
    public Connection getConnection(){
        Connection conn = null;
        try{
            String url = "jdbc:sqlite:/Users/adriancarranza/Documents/GitHub/SE-Group7/SoftwareEngineeringFinalProjectDB-Group7.db";
            conn = DriverManager.getConnection(url);
            System.out.println("DB Connected!");
        }
        catch (SQLException e){
            System.out.println("Message: "+ e.getMessage());
        }
        return conn;
    }
    //public static void main(String args[]){
     //sqlConnection sc = new sqlConnection();
       //System.out.println("Message: "+ sc.getConnection());
   // }
   
    public void loginTable(){
        String sql = "SELECT userId, userName, password, email, mobileNumber FROM users;";
        try(Connection conn = this.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
                while(rs.next()){
                    System.out.println(rs.getString("email") + "\t" + rs.getString("password"));
                }

            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
    }
    //public static void main(String args[]){
      //  sqlConnection sc = new sqlConnection();
          //System.out.println("Message: "+ sc.getConnection());
        //sc.loginTable();

   // }
}


