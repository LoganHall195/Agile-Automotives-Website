package com.example.application.views.main;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.sql.Statement;
import  java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.ResultSet;
import  java.sql.SQLException;

import com.example.application.views.sqlConnection.sqlConnection;

@Route("")
public class LoginView extends Composite<LoginOverlay> {
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
    /*public void loginTable(){
        String sql = "SELECT userId, userName, password, email, mobileNumber FROM users;";
        try(Connection conn = this.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
                while(rs.next()){
                    String userNm = rs.getString("email");
                    String pswd = rs.getString("password");
                    //System.out.println(rs.getString("email") + "\t" + rs.getString("password"));
                }

            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
    }*/

    public LoginView(){
        
      LoginOverlay loginOverlay = getContent();
      loginOverlay.setTitle("Agile Automotive");
      loginOverlay.setDescription("Buy Cars!");
      loginOverlay.setOpened(true);
      String sql = "SELECT userId, userName, password, email, mobileNumber FROM users;";
      try(Connection conn = this.getConnection();
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(sql)){
              while(rs.next()){
                  String id = rs.getString("userId");
                  String userNm = rs.getString("email");
                  String pswd = rs.getString("password");
                  loginOverlay.addLoginListener(event ->{

                    //if("user".equals(event.getUsername())){
                      //  UI.getCurrent().navigate(UserView.class);
                    //} else if ("admin".equals(event.getUsername())) {
                      //  UI.getCurrent().navigate(AdminView.class);}
                    if(userNm.equals(event.getUsername()) && pswd.equals(event.getPassword())){
                        UI.getCurrent().navigate(UserView.class);
                      }
                    if(id.equals("1") && userNm.equals(event.getUsername()) && pswd.equals(event.getPassword())){
                        UI.getCurrent().navigate(AdminView.class);
                      }
                    //if(userNm.equalsIgnoreCase(event.getUsername())){
                      //  Notification.show("Incorrect Login Information");
         //           }
          
                });
                  //System.out.println(rs.getString("email") + "\t" + rs.getString("password"));
              }

          } catch (SQLException e){
              System.out.println(e.getMessage());
          }
      

      loginOverlay.addForgotPasswordListener(forgotPasswordEvent -> {
          Notification.show("Reset Password Notification");
      });

    }
    
    
}


