/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import actors.Personeel;
import java.util.ArrayList;
import java.util.List;
import models.Magazijn.ArticleInStorage;
import interfaces.ICountable;
import interfaces.IWorkable;

/**
 *
 * @author J
 */
public class Magazijn implements IWorkable{
    private List<ArticleInStorage> articles;
    private List<Personeel> personeel;
    
    public Magazijn(){
        articles = new ArrayList<ArticleInStorage>();
        personeel = new ArrayList<Personeel>();
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
    
    public void addNewArticleToStorage(Artikel article, int quantity){
        articles.add(new ArticleInStorage(article, quantity));
    }
    
    public int getArticleQuantity(Artikel article){
        for(ArticleInStorage a : articles){
            if(a.getArticle() == article){
                return a.getQuantity();
            }
        }
        return -1;
    }
    
    public void increaseArticleByX(Artikel article, int increment){
        for(ArticleInStorage a : articles){
            if(a.getArticle() == article){
                a.setQuantity(increment);
                break;//no need to loop further
            }
        }
    }

    class ArticleInStorage implements ICountable{
        private final Artikel article;
        private int quantity = 0;

        public ArticleInStorage(Artikel a, int quantity) {
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
