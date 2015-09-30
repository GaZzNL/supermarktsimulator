/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import models.Magazijn;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Afdeling;
import models.Artikel;

/**
 *
 * @author J
 */
public class DBResultToObjectConverter {
    private List<Artikel> artikelen;
    
    /**
     * Constructer automaticly connects to database inorder to get all the articles. 
     * this list of present articles will be used inside this class for different functions.
     */
    public DBResultToObjectConverter(){
        artikelen = new ArrayList<Artikel>();
        DatabaseController.ConnectToDB();
        DatabaseController.getArticles();
        DatabaseController.Close();
    }
    
    public List<Artikel> ConvertToArticleList(ResultSet rs){
        List<Artikel> temp = new ArrayList<Artikel>();
        try{
            while (rs.next()) {
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                double price = rs.getDouble("Price");
                String type = rs.getString("Type");
                temp.add(new Artikel(id, name, price, type));
                artikelen.add(new Artikel(id, name, price, type));
            }
        }
        catch(Exception e){
            return null;
        }
        return temp;
    }
    /**
     * Gets list of afdelingem and fills these objects with relevant data. then it returns updated list version of the objects afdelingen
     * @param rs
     * @param afdeling
     * @return updated list of objects afdelingen
     */
    public List<Afdeling> populateAfdelingen(ResultSet rs, List<Afdeling> afdelingen){
        try{
            while (rs.next()) {
                int article_id = rs.getInt("Article");
                int isle = rs.getInt("Isle");
                int quantity = rs.getInt("Quantity");
                for(Afdeling afd :  afdelingen){ 
                    if(afd.getId() == isle){
                        for(Artikel art : artikelen){
                            if(art.getArtikelId() == article_id){
                                afd.addArticle(art, quantity);
                            }
                        }
                    }
                }
            }
        }
        catch(Exception e){
            return null;
        }
        return afdelingen;
    }
    
    public Magazijn populateMagazijn(ResultSet rs, Magazijn magazijn){
        try{
            while (rs.next()) {
                int article_id = rs.getInt("Article");
                int quantity = rs.getInt("Quantity");
                for(Artikel art : artikelen){
                    if(art.getArtikelId() == article_id){
                        magazijn.addNewArticleToStorage(art, quantity);
                    }
                }
            }
        }
        catch(Exception e){
            return null;
        }     
        return magazijn;
        
    }
    
}
