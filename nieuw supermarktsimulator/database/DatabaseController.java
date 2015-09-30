/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
    /*
    executeQuery()---for getting the data from database
    executeUpdate()---for insert,update,delete
    execute()-any kind of operations

    */
    /**
     * executeQuery()---for getting the data from database
     * @param cmd query that needs to be executed
     * @return returns database result in ResultSet type
     */
    private static ResultSet QuerySQL(String cmd){
        try{
            Statement statement = connect.createStatement();
            return statement.executeQuery(cmd);
          
        }
        catch (Exception ex){
            return null;
        }
    }

    /**
        executeUpdate()---for insert,update,delete
     * @param cmd the query that needs to be executed
     * @return true if succesfully executed
     */
    private static boolean updateSQL(String cmd){
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
        return updateSQL(
                    "INSERT INTO article"
                    + "(Name, Price, Type)"
                    + "VALUES ("+name +","+price+","+ type +");");
    }
 
    public static boolean addOnDisplay(int articleId, int isle, int quantity){
        return updateSQL(
                    "INSERT INTO articleondisplay"
                    + "(article, Isle, Quantity)"
                    + "VALUES ("+articleId +","+isle+","+ quantity +");");
    }
    
    public static boolean addInTransit(int articleId, int quantity){
        return updateSQL(
                    "INSERT INTO articleintransit"
                    + "(article, Quantity)"
                    + "VALUES ("+articleId +","+quantity +");");
    }
    
    public static boolean addStorage(int articleId, int quantity){
        return updateSQL(
                    "INSERT INTO storage"
                    + "(Article, Quantity)"
                    + "VALUES ("+articleId +","+quantity +");");
    }
    
    public static boolean updateOnDisplay(int articleId, int newQuantity){
        return updateSQL(
                    "UPDATE storage"
                    + "SET Quantity = " + newQuantity
                    + "WHERE article = " +articleId +";");
    }
    
    public static boolean updateInTransit(int articleId, int newQuantity){
        return updateSQL(
                    "UPDATE articleintransit"
                    + "SET Quantity = " + newQuantity
                    + "WHERE article = " +articleId +";");
    }
    
    public static boolean updateStorage(int articleId, int newQuantity){
        return updateSQL(
                    "UPDATE storage"
                    + "SET Quantity = " + newQuantity
                    + "WHERE article = " +articleId +";");
    }
    
    private static ResultSet getTable(String tableName){
                return QuerySQL(
                    "SELECT * FROM "+ tableName +";");
    }
    
    public static ResultSet getTableItemById(String tableName, String columnName, int id){
         return QuerySQL(
                    "SELECT * FROM " + tableName
                    + "WHERE "+columnName+" = "+ id +";");
    }
    
    public static ResultSet getArticles(){
        return getTable("article");
    }

    public static ResultSet getArticlesByType(String type){
        return QuerySQL(
                    "SELECT * FROM article" 
                    + "WHERE Type = "+ type +";");
    }
    
    public static ResultSet getArticlesByName(String name){
        return QuerySQL(
                    "SELECT * FROM article" 
                    + "WHERE Name = "+ name +";");
    }
    
    public static ResultSet GetArticlesInTransit(){
        return getTable("articleintransit");
    }
    
    public static ResultSet GetArticlesOnDisplay(){
        return getTable("articleondisplay");
    }
    
    public static ResultSet GetStorage(){
        return getTable("storage");
    }
    
    public static ResultSet GetArticlesInTransitById(int id){
        return getTableItemById("articleintransit", "article", id);
    }
    
    public static ResultSet GetArticlesOnDisplayById(int id){
        return getTableItemById("articleondisplay", "article", id);
    }
    
    public static ResultSet GetStorageById(int id){
        return getTableItemById("storage", "article", id);
    }
}
