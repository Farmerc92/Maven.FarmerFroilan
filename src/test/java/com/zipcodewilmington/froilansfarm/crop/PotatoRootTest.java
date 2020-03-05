package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.PotatoRoot;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.Potato;
import org.junit.Assert;
import org.junit.Test;

public class PotatoRootTest {
    PotatoRoot testPotatoRoot = new PotatoRoot();

    @Test
    public void potatoRootTest() {
        Assert.assertTrue(testPotatoRoot instanceof Crop);
    }

    @Test
    public void potatoRootTest2() {
        Assert.assertTrue(testPotatoRoot instanceof Produce);
    }

    @Test
    public void potatoRootYieldTest() {
        PotatoRoot testPotatoRoot = new PotatoRoot();
        testPotatoRoot.fertilized = false;
        Potato actual = testPotatoRoot.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void potatoRootYieldTest2() {
        PotatoRoot testPotatoRoot = new PotatoRoot();
        testPotatoRoot.harvested = false;
        Potato actual = testPotatoRoot.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void potatoRootYieldTest3() {
        PotatoRoot testPotatoRoot = new PotatoRoot();
        testPotatoRoot.fertilized = true;
        testPotatoRoot.harvested = true;
        Class actual = testPotatoRoot.yield().getClass();
        Assert.assertNotNull(actual);
    }
}
