package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Assert;
import org.junit.Test;

public class CarrotTest {
    Food testCarrot = new Food();

    @Test
    public void foodTest() {
        Assert.assertTrue(testCarrot instanceof Food);
    }

    @Test
    public void foodTest2() {
        Assert.assertTrue(testCarrot instanceof Edible);
    }
}
