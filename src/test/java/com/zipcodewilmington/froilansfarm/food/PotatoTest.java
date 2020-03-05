package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Assert;
import org.junit.Test;

public class PotatoTest {
    Food testPotato = new Food();

    @Test
    public void potatoTest1() {
        Assert.assertTrue(testPotato instanceof Food);
    }

    @Test
    public void potatoTest2() {
        Assert.assertTrue(testPotato instanceof Edible);
    }
}
