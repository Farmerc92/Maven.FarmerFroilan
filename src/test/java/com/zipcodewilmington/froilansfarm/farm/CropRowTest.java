package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropRowTest {

    @Test
    public void setAndGetCropTypeTest(){
        CropRow row1 = new CropRow();
        Crop nullCrop = row1.getCrop();

        Assert.assertNull(nullCrop);

        TomatoPlant tomato = new TomatoPlant();
        row1.setCropType(tomato);

        String expectedType = "Tomato Plant";
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
