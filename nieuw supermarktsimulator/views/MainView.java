/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.Controller;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.*;


/**
 *
 * @author robert
 */
public class MainView {
    
    private Controller controller;
    private JFrame frame;
    
    
    public MainView(Controller controller)
    {
        this.controller = controller;
        //frame = new JFrame("Main frame");
        createUI();
        this.frame.setVisible(true);
    }
    
    public  void createUI()
    {
        this.frame.setLayout(new BorderLayout());
        this.frame = new SupermarktView();
        this.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.frame.pack();
        this.frame.setLocationRelativeTo(null);
    }
}
