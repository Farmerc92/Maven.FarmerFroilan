package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Assert;
import org.junit.Test;

public class OnionTest {
    Food testOnion = new Food();

    @Test
    public void onionTest1() {
        Assert.assertTrue(testOnion instanceof Food);
    }

    @Test
    public void onionTest2() {
        Assert.assertTrue(testOnion instanceof Edible);
    }
}
