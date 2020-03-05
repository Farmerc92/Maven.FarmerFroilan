package com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.person.Pilot;

import java.lang.reflect.Array;

public class FarmHouse {
    Pilot pilot;
    Farmer farmer;

    public void setFarmer(Farmer farmerToSet){
        this.farmer =  farmerToSet;
    }
    public void setPilot(Pilot pilotToSet) {
        this.pilot = pilotToSet;
    }
    public Pilot getPilot() {
        return this.pilot;
    }
    public Farmer getFarmer(){
        return this.farmer;
    }
    public void setFarmerAndPilot(Farmer newFarmer , Pilot newPilot){
        this.farmer = newFarmer;
        this.pilot = newPilot;
    }
    public Person[] getFarmerAndPilot(){
        Person[] farmPeople = new Person[2];
        farmPeople[0] = farmer;
        farmPeople[1] = pilot;
        return farmPeople;
    }
}
