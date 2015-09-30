package models;

import actors.Personeel;

public class Kassa{
    private Personeel personeel;
    private Boolean inUse;
    
     public Kassa(){ 
    }
     
    public Personeel getPersoneel() {
        return personeel;
    }

    public void setPersoneel(Personeel personeel) {
        this.personeel = personeel;
        if(personeel == null)
            inUse = false;
        else
            inUse = true;
    }

    public Boolean getInUse() {
        return inUse;
    }

}
