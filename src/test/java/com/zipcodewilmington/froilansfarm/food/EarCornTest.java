package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Food;
import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    public class earCornTest {
        Food testEarCorn = new Food();

        @Test
        public void foodTest() {
            Assert.assertTrue(testEarCorn instanceof Food);
        }

        @Test
        public void foodTest2() {
            Assert.assertTrue(testEarCorn instanceof Edible);
        }
    }
}
