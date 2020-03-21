package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Person;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    Farmer toby = new Farmer("Toby","male");
    Pilot sandy =  new Pilot("Sandy","female");

    @Test
    public void setFarmerTest(){
        FarmHouse farmVille = new FarmHouse();
        farmVille.setFarmer(toby);

        Assert.assertEquals(toby,farmVille.getFarmer());
    }

    @Test
    public void setPilotTest(){
        FarmHouse farmVille = new FarmHouse();
        farmVille.setPilot(sandy);

        Assert.assertEquals(sandy,farmVille.getPilot());
    }
    @Test
    public void setFarmerAndPilotTest(){
        FarmHouse farmVille = new FarmHouse();
        farmVille.setFarmerAndPilot(toby,sandy);

        Person[] expectedArray = {toby,sandy};
        Person[] actualArray = farmVille.getFarmerAndPilot();

        Assert.assertEquals(expectedArray , actualArray);
    }
}
