package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class TestCropDuster {
    @Test
    public void testCropDusterInheritance(){
        Pilot pilot = new Pilot("","");
        CropDuster cropDuster = new CropDuster(pilot);

        Assert.assertTrue(cropDuster instanceof Aircraft);
    }
    @Test
    public void testCropDusterInheritance1(){
        Pilot pilot = new Pilot("","");
        CropDuster cropDuster = new CropDuster(pilot);

        Assert.assertTrue(cropDuster instanceof Vehicle);
    }
    @Test
    public void testCropDusterInheritance2(){
        Pilot pilot = new Pilot("","");
        CropDuster cropDuster = new CropDuster(pilot);

        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }
    @Test
    public void testCropDusterInheritance3(){
        Pilot pilot = new Pilot("","");
        CropDuster cropDuster = new CropDuster(pilot);

        Assert.assertTrue(cropDuster instanceof Rideable);
    }
    @Test
    public void testCrash(){

    }
}
