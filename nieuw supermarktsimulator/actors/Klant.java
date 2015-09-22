package actors;
import models.WinkelMand;
import interfaces.Betaalwijze;
        
public class Klant extends Persoon implements Betaalwijze{

	private WinkelMand winkelMand;

	private Betaalwijze betaalwijze;

	//private WinkelMand winkelMand;

	private Personeel personeel;

}
