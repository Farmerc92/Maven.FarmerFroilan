package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class TestTractor {
    @Test
    public void testTractorInheritance(){
        Farmer farmer = new Farmer("","");
        Tractor tractor = new Tractor(farmer);

        Assert.assertTrue(tractor instanceof Vehicle);
    }
    @Test
    public void testTractorInheritance1(){
        Farmer farmer = new Farmer("","");
        Tractor tractor = new Tractor(farmer);

        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void testTractorInheritance2(){
        Farmer farmer = new Farmer("","");
        Tractor tractor = new Tractor(farmer);

        Assert.assertTrue(tractor instanceof Rideable);
    }

}
