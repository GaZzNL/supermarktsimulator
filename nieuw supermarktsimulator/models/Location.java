/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Point;

/**
 *
 * @author robert
 */
public abstract class Location {
    private Point location;
    private Object object;
    
    public Location(Object object, Point location)
    {
        this.object = object;
        this.location = location;
    }
    
    public Point getlocation()
    {
        return location;
    }
    
    public Object getObject()
    {
        return object;
    }
}
