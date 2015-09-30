/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author robert
 */
public class Controller {
    private Observable model;
    private final List<Observer> view;
    
    public Controller()
    {
        this.view = new ArrayList<>();
    }
    
    public void setModel(Observable model)
    {
        this.model = model;
        view.stream().forEach((value) -> {
            model.addObserver(value);
        });
    }
    
    public void addView(Observer observer)
    {
        this.view.add(observer);
        this.model.addObserver(observer);
    }
}
