package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import org.junit.Assert;
import org.junit.Test;

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
}
