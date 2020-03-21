package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {
    Food testTomato = new Food();

    @Test
    public void tomatoTest1() {
        Assert.assertTrue(testTomato instanceof Food);
    }

    @Test
    public void tomatoTest2() {
        Assert.assertTrue(testTomato instanceof Edible);
    }
}
