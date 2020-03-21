package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    Chicken genericChicken = new Chicken();
    @Test
    public void addChickensTest(){
        ChickenCoop coop1 = new ChickenCoop();

        Integer expected = 0;
        Integer actual = coop1.getNumOfChickens();
        Assert.assertEquals(expected,actual);

        coop1.addChickens(2);

        Integer expected2 = 2;
        Integer actual2 = coop1.getNumOfChickens();
        Assert.assertEquals(expected2,actual2);
    }
    @Test
    public void removeChickensTest(){
        ChickenCoop coop2 = new ChickenCoop();
        coop2.addChickens(2);

        Integer expected = 2;
        Integer actual = coop2.getNumOfChickens();
        Assert.assertEquals(expected,actual);

        coop2.removeChicken(1);
        Integer expected2 = 1;
        Integer actual2 = coop2.getNumOfChickens();
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void getNumOfChickensTest(){
        ChickenCoop coop4 = new ChickenCoop();
        coop4.addChickens(2);
        coop4.removeChicken(8);
        Integer expected = 2;
        Integer actual = coop4.getNumOfChickens();
        Assert.assertEquals(expected,actual);
    }

}
