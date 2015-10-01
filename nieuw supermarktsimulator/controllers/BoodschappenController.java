/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import actors.Klant;
import java.util.ArrayList;
import java.util.List;
import models.Artikel;

/**
 *
 * @author J
 */
public class BoodschappenController {
    
    public static List<Artikel> generateBoodschap(Klant klant){
        List<Artikel> artikellen = new DBResultToObjectConverter().ConvertToArticleList(DatabaseController.getArticles());

        switch(klant.getKlantType()){
        
            case "moeder":
                return generateListMom(artikellen);
            case "prepper":
                return generateListPrepper(artikellen);
            case "student":
                return generateListStudent(artikellen);
            
        }
        return null;
    }
    
    private static List<Artikel> generateListMom(List<Artikel> artikellen){
        List<Artikel> temp = new ArrayList<Artikel>();
        for(Artikel art : artikellen){
            if(art.getType() != "frisdrank" || art.getType() != "drank"){
                for(int i = 0; i < Math.random() * 5; i++){ // randomly take X ammount of product
                    temp.add(art);
                }
            }
        }
        return temp;
    }
    
    private static List<Artikel> generateListStudent(List<Artikel> artikellen){
        List<Artikel> temp = new ArrayList<Artikel>();
        while(temp.isEmpty()){
            for(Artikel art : artikellen){
                if(art.getType() == "frisdrank" || art.getType() == "drank"){
                    if(Math.random() * 4 == 4){//25% chance that student will buy that product
                        for(int i = 0; i < Math.random() * 3; i++){ // randomly take X ammount of product
                            temp.add(art);
                        }
                    }
                }
            }
        }
        return temp;
    }
    
    private static List<Artikel> generateListPrepper(List<Artikel> artikellen){
        List<Artikel> temp = new ArrayList<Artikel>();
        while(temp.isEmpty()){
            for(Artikel art : artikellen){
                if(Math.random() * 2 == 2){//50% chance that student will buy that product
                    for(int i = 0; i < Math.random() * 8; i++){ // randomly take X ammount of product
                        temp.add(art);
                    }
                }           
            }
        }
        return temp;
    }
}
