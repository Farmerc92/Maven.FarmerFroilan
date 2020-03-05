package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.CarrotRoot;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import org.junit.Assert;
import org.junit.Test;

public class CarrotRootTest {
     CarrotRoot testCarrotRoot = new CarrotRoot();


    @Test
    public void carrotRootCropTest1() {
        Assert.assertTrue(testCarrotRoot instanceof Crop);
    }

    @Test
    public void carrotRootProduceTest() {
        Assert.assertTrue(testCarrotRoot instanceof Produce);
    }

    @Test
    public void carrotRootYieldTest() {
        CarrotRoot testCarrotRoot = new CarrotRoot();
        testCarrotRoot.fertilized = false;
        Carrot actual = testCarrotRoot.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void carrotRootYieldTest2() {
        CarrotRoot testCarrotRoot = new CarrotRoot();
        testCarrotRoot.harvested = false;
        Carrot actual = testCarrotRoot.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void carrotRootYieldTest3() {
        CarrotRoot testCarrotRoot = new CarrotRoot();
        testCarrotRoot.fertilized = true;
        testCarrotRoot.harvested = true;
        Class actual = testCarrotRoot.yield().getClass();
        Assert.assertNotNull(actual);
    }
}
