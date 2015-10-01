package actors;
import models.WinkelMand;
import interfaces.Betaalwijze;
import java.util.ArrayList;
import java.util.List;
import models.Artikel;
        
public class Klant extends Persoon implements Betaalwijze{
 
        private final String klantType;
	private WinkelMand winkelMand;
	private Betaalwijze betaalwijze;
        private List<Artikel> boodschappenlijst;
        
        public Klant(String klantType){
            this.klantType = klantType;
            winkelMand = new WinkelMand();
            boodschappenlijst = new ArrayList<Artikel>();
        }
        
        public String getKlantType() {
            return klantType;
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
