package views;

import java.awt.Graphics2D;
import java.awt.Point;
import models.Location;

abstract class FieldView{
    
    private Point location;
    
    public FieldView(Location location)
    {
        this.location = location.getlocation();
    }
    
    public abstract void draw(Graphics2D g);
}
