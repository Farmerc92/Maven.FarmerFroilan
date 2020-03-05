package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void testGetAndGetCropRow(){
        Field fieldy = new Field();
        TomatoPlant tomato = new TomatoPlant();
        fieldy.setCropRow(3, tomato);

        String expected = "Tomato Plant";
        String actual = fieldy.getCropRow(3).checkCropType();

        Assert.assertEquals(expected,actual);
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
