/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarkt;

import controllers.Controller;
import database.DatabaseController;

/**
 *
 * @author robert
 */
public class Supermarkt {
    
    public Supermarkt(){
        testDatabase();
    }
    
    public void testDatabase(){
       Boolean test =  DatabaseController.ConnectToDB();
       DatabaseController.isConnected();
    }
}
