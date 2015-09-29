/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J
 */
public class DatabaseController {
    private static Connection connect;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String DATABASE_NAME = "supermarkt";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static boolean ConnectToDB(){
        try {
            Class.forName(DRIVER);
            connect = DriverManager.getConnection(URL 
                    + DATABASE_NAME 
                    + "?user="+USER+
                    "&password="+PASSWORD);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private static ResultSet executeCommand(String cmd){
        try{
            Statement statement = connect.createStatement();
            return statement.executeQuery(cmd);
          
        }
        catch (Exception ex){
            return null;
        }
    }
    
    private static boolean updateCommand(String cmd){
        try{
            Statement statement = connect.createStatement();
            statement.executeUpdate(cmd);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
    
    public static boolean addArticle(String name, double price, String type){
        return updateCommand(""
                    + "INSERT INTO article"
                    + "(Name, Price, Type)"
                    + "VALUES ("+name +","+price+","+ type +");");
    }
 
    public static boolean addOnDisplay(int articleId, int isle, int quantity){
        return updateCommand(""
                    + "INSERT INTO articleondisplay"
                    + "(article, Isle, Quantity)"
                    + "VALUES ("+articleId +","+isle+","+ quantity +");");
    }
    
    public static boolean addInTransit(int articleId, int quantity){
        return updateCommand(""
                    + "INSERT INTO articleintransit"
                    + "(article, Quantity)"
                    + "VALUES ("+articleId +","+quantity +");");
    }
    
    public static boolean addStorage(int articleId, int quantity){
        return updateCommand(""
                    + "INSERT INTO storage"
                    + "(Article, Quantity)"
                    + "VALUES ("+articleId +","+quantity +");");
    }
        
    public static boolean isConnected(){
        try {
            if(connect.isClosed()){
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    
    public static boolean Close(){
        try {
            connect.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
