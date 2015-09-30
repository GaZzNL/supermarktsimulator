package actors;
import models.WinkelMand;
import interfaces.Betaalwijze;
import java.util.ArrayList;
import java.util.List;
import models.Artikel;
        
public class Klant extends Persoon implements Betaalwijze{

	private WinkelMand winkelMand;

	private Betaalwijze betaalwijze;

	//private WinkelMand winkelMand;

	private Personeel personeel;
        
        private List<Artikel> boodschappenlijst;
        
        public Klant(){
            winkelMand = new WinkelMand();
            boodschappenlijst = new ArrayList<Artikel>();
        }
        
        public WinkelMand getWinkelMand() {
            return winkelMand;
        }

        public void setWinkelMand(WinkelMand winkelMand) {
            this.winkelMand = winkelMand;
        }

        public Betaalwijze getBetaalwijze() {
            return betaalwijze;
        }

        public void setBetaalwijze(Betaalwijze betaalwijze) {
            this.betaalwijze = betaalwijze;
        }

        public Personeel getPersoneel() {
            return personeel;
        }

        public void setPersoneel(Personeel personeel) {
            this.personeel = personeel;
        }

        public List<Artikel> getBoodschappenlijst() {
            return boodschappenlijst;
        }

        public void setBoodschappenlijst(List<Artikel> boodschappenlijst) {
            this.boodschappenlijst = boodschappenlijst;
        }
        
        public void addBoodschappenlijst(Artikel art){
            this.boodschappenlijst.add(art);
        }
        
        public Artikel getItemBoodschappenlijst(int id){
            return this.boodschappenlijst.get(id);
        }
        
        public void removeFromBoodschappenlijst(int id){
            this.boodschappenlijst.remove(id);
        }
}
