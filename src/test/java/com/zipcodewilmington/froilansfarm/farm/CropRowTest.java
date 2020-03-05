package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropRowTest {

    @Test
    public void setAndGetCropTypeTomatoTest(){
        CropRow row1 = new CropRow();
        Crop nullCrop = row1.getCrop();

        Assert.assertNull(nullCrop);

        TomatoPlant tomato = new TomatoPlant();
        row1.setCropType(tomato);
        Crop unKnullCrop = row1.getCrop();
        Assert.assertFalse(unKnullCrop.equals(null));

        String expectedType = "Tomato Plant";
        String actualType =  row1.checkCropType();
        Assert.assertEquals(expectedType,actualType);
    }
    @Test
    public void setAndGetCropTypePotatoTest(){
        CropRow row1 = new CropRow();
        Crop nullCrop = row1.getCrop();

        Assert.assertNull(nullCrop);

        PotatoRoot potato = new PotatoRoot();
        row1.setCropType(potato);

        String expectedType = "Potato Root";
        String actualType =  row1.checkCropType();
        Assert.assertEquals(expectedType,actualType);
    }
    @Test
    public void setAndGetCropTypeOnionTest(){
        CropRow row1 = new CropRow();
        Crop nullCrop = row1.getCrop();

        Assert.assertNull(nullCrop);

        OnionRoot onion = new OnionRoot();
        row1.setCropType(onion);

        String expectedType = "Onion Root";
        String actualType =  row1.checkCropType();
        Assert.assertEquals(expectedType,actualType);
    }
    @Test
    public void setAndGetCropTypeCornTest(){
        CropRow row1 = new CropRow();
        Crop nullCrop = row1.getCrop();

        Assert.assertNull(nullCrop);

        CornStalk corn = new CornStalk();
        row1.setCropType(corn);

        String expectedType = "Corn Stalk";
        String actualType =  row1.checkCropType();
        Assert.assertEquals(expectedType,actualType);
    }
    @Test
    public void setAndGetCropTypeCarrotTest(){
        CropRow row1 = new CropRow();
        Crop nullCrop = row1.getCrop();

        Assert.assertNull(nullCrop);

        CarrotRoot carrot = new CarrotRoot();
        row1.setCropType(carrot);

        String expectedType = "Carrot Root";
        String actualType =  row1.checkCropType();
        Assert.assertEquals(expectedType,actualType);
    }
    @Test
    public void getRowTest(){
        CropRow row1 =  new CropRow();
        TomatoPlant tomato = new TomatoPlant();
        row1.setCropType(tomato);

        ArrayList<Crop> row1CropArray =  row1.getRow();
        Assert.assertEquals(5,row1CropArray.size());

        Assert.assertEquals(tomato,row1CropArray.get(0));
    }
}
