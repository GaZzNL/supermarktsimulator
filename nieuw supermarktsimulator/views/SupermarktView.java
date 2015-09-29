package views;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import models.Location;

public class SupermarktView extends JFrame /*implements ActionListener*/ {
    
    private List<Location> locations;
    
    public SupermarktView()
    {
        this.locations = new ArrayList<>();
                
    }




	/*private FieldStats fieldStats;

	private FieldView fieldView;
        
        private JFrame frame;

        /**
         * Class die straks de waardes update
         * @param args 
         */
    /*
        public static void main(String[] args)
        {
            EventQueue.invokeLater(() -> {
                try{
                    SupermarktView windows = new SupermarktView();
                    windows.frame.setVisible(true);
                    //DEBUG modes
                    System.out.println(windows);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            });
        }
        /*
        public SupermarktView()
        {
            initialize();
        }
        
        private void initialize()
        {
            frame = new JFrame();
            frame.setBounds(100, 100, 450, 300);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }*/
}
