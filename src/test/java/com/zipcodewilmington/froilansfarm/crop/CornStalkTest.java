package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {
    CornStalk testCornStalk = new CornStalk();

    @Test
    public void cornStalkTest1() {
        Assert.assertTrue(testCornStalk instanceof Crop);
    }

    @Test
    public void cornStalkTest2() {
        Assert.assertTrue(testCornStalk instanceof Produce);
    }

    @Test
    public void cornStalkYieldTest() {
        CornStalk testCornStalk = new CornStalk();
        testCornStalk.fertilized = false;
        EarCorn actual = testCornStalk.yield();
        Assert.assertNull(actual);
    }

   @Test
    public void cornStalkYieldTest2() {
        CornStalk testCornStalk = new CornStalk();
        testCornStalk.fertilized = false;
        EarCorn actual = testCornStalk.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void cornStalkYieldTest3() {
        CornStalk testCornStalk = new CornStalk();
        testCornStalk.fertilized = true;
        testCornStalk.harvested = true;
        Class actual = testCornStalk.yield().getClass();
        Assert.assertNotNull(actual);
    }
}
