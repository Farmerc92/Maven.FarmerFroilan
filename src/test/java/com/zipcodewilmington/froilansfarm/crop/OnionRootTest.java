package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.OnionRoot;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.Onion;
import org.junit.Assert;
import org.junit.Test;

public class OnionRootTest {
    OnionRoot testOnionRoot = new OnionRoot();

    @Test
    public void onionRootTest1() {
        Assert.assertTrue(testOnionRoot instanceof Crop);
    }

    @Test
    public void onionRootTest2() {
        Assert.assertTrue(testOnionRoot instanceof Produce);
    }

    @Test
    public void onionRootYieldTest() {
        OnionRoot testOnionRoot = new OnionRoot();
        testOnionRoot.fertilized = false;
        Onion actual = testOnionRoot.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void onionRootYieldTest2() {
        OnionRoot testOnionRoot = new OnionRoot();
        testOnionRoot.harvested = false;
        Onion actual = testOnionRoot.yield();
        Assert.assertNull(actual);
    }

    @Test
    public void onionRootYieldTest3() {
        OnionRoot testOnionRoot = new OnionRoot();
        testOnionRoot.fertilized = true;
        testOnionRoot.harvested = true;
        Class actual = testOnionRoot.yield().getClass();
        Assert.assertNotNull(actual);
    }
}
