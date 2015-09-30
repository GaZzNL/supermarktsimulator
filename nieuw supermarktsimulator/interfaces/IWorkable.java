/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import actors.Personeel;
import java.util.List;

/**
 *
 * @author J
 */
public interface IWorkable {
    public void addPersoneel(Personeel personeel);
    public void removePersoneel(int id);
    public List<Personeel> getPersoneel();
}
