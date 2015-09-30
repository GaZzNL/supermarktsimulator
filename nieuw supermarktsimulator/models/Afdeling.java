/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import actors.Klant;
import actors.Personeel;
import java.util.ArrayList;
import java.util.List;
import interfaces.ICountable;
import interfaces.ICustomerInteractable;
import interfaces.IWorkable;

/**
 *
 * @author J
 */
public class Afdeling implements IWorkable,ICustomerInteractable{
    private final int id;
    private List<ArticleOnDisplay> artikelen; 
    private List<Personeel> personeel;
    private List<Klant> klanten;
    
    public Afdeling(int id){
        this.id = id;
        artikelen = new ArrayList<ArticleOnDisplay>();
        personeel =  new ArrayList<Personeel>();
        klanten = new ArrayList<Klant>();
    }
    
    public int getId() {
        return id;
    }
    
    public void addArticle(Artikel art, int quantity){
        this.artikelen.add(new ArticleOnDisplay(art, quantity));
    }
    
    public void removeArticle(int id){
        this.artikelen.remove(id);
    }
    
    public Artikel getArticle(int id){
        return this.artikelen.get(id).getArticle();
    }
    
    public void addPersoneel(Personeel personeel){
        this.personeel.add(personeel);
    }
    
    public void removePersoneel(int id){
        this.personeel.remove(id);
    }
    
    public List<Personeel> getPersoneel(){
        return personeel;
    } 
    
    public void addKlant(Klant klant){
        this.klanten.add(klant);
    }
    
    public void removeKlant(int id){
        this.personeel.remove(id);
    }
    
    public List<Klant> getKlanten(){
        return klanten;
    } 
    
    public int getArticleQuantity(Artikel article){
        for(ArticleOnDisplay a : artikelen){
            if(a.getArticle() == article){
                return a.getQuantity();
            }
        }
        return -1;
    }
    
    public void increaseArticleByX(Artikel article, int increment){
        for(ArticleOnDisplay a : artikelen){
            if(a.getArticle() == article){
                a.setQuantity(increment);
                break;//no need to loop further
            }
        }
    }

    class ArticleOnDisplay implements ICountable{//nested klassen uitproberen
        private final Artikel article;
        private int quantity = 0;

        public ArticleOnDisplay(Artikel a, int quantity) {
            this.article = a;
            this.quantity = quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity += quantity;
        }

        public Artikel getArticle() {
            return article;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
