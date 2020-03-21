package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {
    Food testEgg = new Food();

    @Test
    public void eggTest1() {
        Assert.assertTrue(testEgg instanceof Food);
    }

    @Test
    public void eggTest2() {
        Assert.assertTrue(testEgg instanceof Edible);
        }

}
