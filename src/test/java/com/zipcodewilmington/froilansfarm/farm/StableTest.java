package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import org.junit.Assert;
import org.junit.Test;

public class StableTest{

    Horse genericHorse = new Horse();
    @Test
    public void addHorsesTest(){
        Stable stable1 = new Stable();

        Integer expected = 0;
        Integer actual = stable1.getNumOfHorses();
        Assert.assertEquals(expected,actual);

        stable1.addHorses(2);

        Integer expected2 = 2;
        Integer actual2 = stable1.getNumOfHorses();
        Assert.assertEquals(expected2,actual2);
    }
    @Test
    public void removeHorsesTest(){
        Stable stable2 = new Stable();
        stable2.addHorses(2);

        Integer expected = 2;
        Integer actual = stable2.getNumOfHorses();
        Assert.assertEquals(expected,actual);

        stable2.removeHorses(1);
        Integer expected2 = 1;
        Integer actual2 = stable2.getNumOfHorses();
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void getNumOfHorsesTest(){
        Stable stable3 = new Stable();
        stable3.addHorses(2);
        stable3.removeHorses(8);
        Integer expected = 2;
        Integer actual = stable3.getNumOfHorses();
        Assert.assertEquals(expected,actual);
    }

}
