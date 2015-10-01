/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarkt;

import controllers.DatabaseController;
import java.util.Observable;
import models.Location;

/**
 *
 * @author robert
 */

public class Supermarkt extends Observable{
    
    private Location location;
    
    private DatabaseController database;
    
    private boolean run;
    
    
    public Supermarkt(Location layout)
    {
        this.location = layout;
        
        this.database = new DatabaseController();
        
        
        this.run = false;
        //connectDatabase();
    }
    
    private void connectDatabase(){
       //database =  DatabaseController.ConnectToDB();
       //DatabaseController.isConnected();
    }
    
    void run()
    {
        this.run = true;
        while(run)
        {
            //Update de observable
            setChanged();
            //Hier moet de tick methodes komen
        }
    }
}
