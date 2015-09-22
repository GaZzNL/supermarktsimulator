public class SupermarktSimulatie {

    private Random random;

    private Supermarkt supermarkt;

    //private Supermarkt supermarkt;

    private Levering levering;

    private SupermarktView supermarktView;

    private SupermarktField supermarktField;
    
    private static int stap;

    
    /**
     * Maakt eerst een frame en dan start de Supermarkt simulator
     * 
     * @param args 
     */
    public SupermarktSimulatie()
    {
        
        
        supermarkt = new Supermarkt();
    }
}
