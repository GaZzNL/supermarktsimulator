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
    private final String name;
    private final String type;
    private Double price;

    public Artikel(String name, Double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
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
