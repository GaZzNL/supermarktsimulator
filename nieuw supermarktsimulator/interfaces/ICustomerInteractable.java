/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import actors.Klant;
import java.util.List;

/**
 *
 * @author J
 */
public interface ICustomerInteractable {
    public void addKlant(Klant klant);
    public void removeKlant(int id);
    public List<Klant> getKlanten();
}
