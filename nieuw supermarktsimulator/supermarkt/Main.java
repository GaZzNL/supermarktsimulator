/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarkt;

import controllers.Controller;

/**
 *
 * @author robert
 */
public class Main {
    
    public static void main(String[] args) {
        
        Controller controller = new Controller();
        
        new Thread(new Runnable(){
            public void run() {
                Supermarkt supermarkt = new Supermarkt();
            }
        }).start();
    }
    
}
