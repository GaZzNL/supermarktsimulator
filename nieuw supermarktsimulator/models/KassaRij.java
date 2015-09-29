package models;


import actors.Klant;
import java.util.ArrayList;
import java.util.List;
import superInterfaces.ICustomerInteractable;

public class KassaRij implements ICustomerInteractable{
    
	private Kassa kassa;

	private List<Klant> klanten;
        
    public KassaRij(Kassa kassa){
        this.kassa =  kassa;
        this.klanten = new ArrayList<Klant>();
    }
    
    @Override
    public void addKlant(Klant klant) {
        this.klanten.add(klant);
    }

    @Override
    public void removeKlant(int id) {
        this.klanten.remove(id);
    }

    @Override
    public List<Klant> getKlanten() {
        return this.klanten;
    }


}
