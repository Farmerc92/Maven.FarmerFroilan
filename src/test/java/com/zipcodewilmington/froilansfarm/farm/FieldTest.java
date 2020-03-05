package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void testGetAndGetCropRow(){
        Field fieldy = new Field();

        PotatoRoot  potato = new PotatoRoot();
        OnionRoot onion = new OnionRoot();
        TomatoPlant tomato = new TomatoPlant();
        CarrotRoot carrot = new CarrotRoot();
        CornStalk corn = new CornStalk();

        fieldy.setCropRow(1, potato);
        fieldy.setCropRow(2, onion);
        fieldy.setCropRow(3, tomato);
        fieldy.setCropRow(4, carrot);
        fieldy.setCropRow(5, corn);

        String expected1 = "Potato Root";
        String actual = fieldy.getCropRow(1).checkCropType();
        Assert.assertEquals(expected1,actual);

        String expected2 = "Onion Root";
        String actual2 = fieldy.getCropRow(2).checkCropType();
        Assert.assertEquals(expected2,actual2);

        String expected3 = "Tomato Plant";
        String actual3 = fieldy.getCropRow(3).checkCropType();
        Assert.assertEquals(expected3,actual3);

        String expected4 = "Carrot Root";
        String actual4 = fieldy.getCropRow(4).checkCropType();
        Assert.assertEquals(expected4,actual4);

        String expected5 = "Corn Stalk";
        String actual5 = fieldy.getCropRow(5).checkCropType();
        Assert.assertEquals(expected5,actual5);

        Assert.assertNull(fieldy.getCropRow(7));
    }
    @Test

    public void testIsEmpty(){
        Field fieldy = new Field();
        TomatoPlant tomato = new TomatoPlant();
        fieldy.setCropRow(3, tomato);

        CropRow row3=  fieldy.getCropRow(3);

        Assert.assertFalse(fieldy.isEmpty(row3));
    }



}
