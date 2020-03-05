package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
    Horse testHorse = new Horse();
    Person testPerson = new Farmer("Jimmy","male")

    {
        public void MakeNoise() {

        }

        public void Eat() {

        }
    };
    @Test
    public void inheritanceTest() {
        Assert.assertTrue(testHorse instanceof Animal);
    }

    @Test
    public void inheritanceTest2(){
        Assert.assertTrue(testHorse instanceof NoiseMaker);
    }

    @Test
    public void inheritanceTest3(){
        Assert.assertTrue(testHorse instanceof Eater);
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(testHorse instanceof Rideable);
    }


//    @Test
//    public void getSetRiderTest(){
//        testHorse.setRider(testPerson);
//        Person expected = testPerson;
//        Person actual = testHorse.getRider();
//        Assert.assertEquals(expected,actual);
//    }


    @Test
    public void makeNoiseTest(){


    }

    @Test
    public void eatTest(){}
}