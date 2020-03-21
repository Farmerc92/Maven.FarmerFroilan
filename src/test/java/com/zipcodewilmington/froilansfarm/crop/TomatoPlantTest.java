package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {
    TomatoPlant testTomatoPlant = new TomatoPlant();

    @Test
    public void tomatoPlantTest1() {
        Assert.assertTrue(testTomatoPlant instanceof Crop);
    }

    @Test
    public void tomatoPlantTest2() {

        Assert.assertTrue(testTomatoPlant instanceof Produce);}

    @Test
    public void tomatoPlantYieldTest() {
        TomatoPlant testTomatoPlant = new TomatoPlant();
        testTomatoPlant.fertilized = false;
        Tomato actual = testTomatoPlant.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void carrotRootYieldTest2() {
        TomatoPlant testTomatoPlant = new TomatoPlant();
        testTomatoPlant.harvested = false;
        Tomato actual = testTomatoPlant.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void carrotRootYieldTest3() {
        TomatoPlant testTomatoPlant = new TomatoPlant();
        testTomatoPlant.fertilized = true;
        testTomatoPlant.harvested = true;
        Class actual = testTomatoPlant.yield().getClass();
        Assert.assertNotNull(actual);

    }
}


