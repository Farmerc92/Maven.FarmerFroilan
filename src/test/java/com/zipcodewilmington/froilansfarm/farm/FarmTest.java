package com.zipcodewilmington.froilansfarm.farm;

import com.sun.tools.corba.se.idl.InterfaceGen;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {
    Farmer farmer = new Farmer("Bob","Male");
    Pilot pilot = new Pilot("Sally","female");
    Farm lehigh = new Farm(3,3,farmer,pilot);
    @Test
    public void farmConstructor(){
        Assert.assertEquals(farmer,lehigh.getFarmer());
        Assert.assertEquals(pilot,lehigh.getPilot());

        Integer ExpectedStables = 3;
        Assert.assertEquals(ExpectedStables,lehigh.getNumOfStables());

        Integer ExpectedCoops = 3;
        Assert.assertEquals(ExpectedCoops,lehigh.getNumOfCoops());


    }
    @Test
    public void setHorsesInStableTest(){
        Farm clone1 =  lehigh;
        clone1.setHorsesInStable(1,3);
        clone1.setHorsesInStable(2,3);
        clone1.setHorsesInStable(3,3);

        Integer expectedHorsesInstable1 = 3;
        Assert.assertEquals(expectedHorsesInstable1 , lehigh.getStable(1).getNumOfHorses());
        Integer expectedHorsesInstable2 = 3;
        Assert.assertEquals(expectedHorsesInstable1 , lehigh.getStable(2).getNumOfHorses());
        Integer expectedHorsesInstable3 = 3;
        Assert.assertEquals(expectedHorsesInstable1 , lehigh.getStable(3).getNumOfHorses());
    }
    @Test
    public void setChickensInCoopTest(){
        Farm clone2 =  lehigh;
        clone2.setChickensInCoop(1,3);
        clone2.setChickensInCoop(2,3);
        clone2.setChickensInCoop(3,3);

        Integer expectedChickensInCoop1 = 3;
        Assert.assertEquals(expectedChickensInCoop1 , lehigh.getChickenCoop(1).getNumOfChickens());
        Integer expectedChickensInCoop2 = 3;
        Assert.assertEquals(expectedChickensInCoop2 , lehigh.getChickenCoop(2).getNumOfChickens());
        Integer expectedChickensInCoop3 = 3;
        Assert.assertEquals(expectedChickensInCoop3 , lehigh.getChickenCoop(3).getNumOfChickens());
    }
    @Test
    public void getAllCoopsTest(){
        ArrayList<ChickenCoop> coops = lehigh.getAllCoops();
        ArrayList<Stable>  stables = lehigh.getAllStables();

        Assert.assertEquals(3, coops.size());
        Assert.assertEquals(3, stables.size());
    }
    @Test
    public void getTractor(){
        Tractor actualTractor = lehigh.getTractor();
        Assert.assertEquals(null, actualTractor);
    }
    @Test
    public void getCropDuster(){
        CropDuster actualCropDuster = lehigh.getCropDuster();
        Assert.assertEquals(null, actualCropDuster);
    }



}
