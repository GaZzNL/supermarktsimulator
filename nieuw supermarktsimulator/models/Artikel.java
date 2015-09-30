/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author J
 */
public class Artikel {
    private final int artikelId;//saved for ease of use.
    private final String name;
    private final String type;
    private Double price;

    public Artikel(int artikelId, String name, Double price, String type){
        this.artikelId =  artikelId;
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public int getArtikelId() {
        return artikelId;
    }
    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    
}
