package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Farmer farmer = new Farmer("joe", "Female");

    @Test
    public void instanceTest1() { Assert.assertTrue(farmer instanceof Eater); }

    @Test
    public void instanceTest2() { Assert.assertTrue(farmer instanceof NoiseMaker); }

    @Test
    public void getNameTest() {
        Person p1 = new Farmer("Joe", "Male");
        String expected = "Joe";
        String actual = p1.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
        Person p1 = new Farmer("Joe", "Male");
        p1.setName("Jack");
        String expected  = "Jack";
        String actual = p1.getName();
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void getGender() {
        Person p1 = new Farmer("Joe", "Male");
        String expected = "Male";
        String actual = p1.getGender();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setGender() {
        Person p1 = new Farmer("Joe", "Male");
        p1.setGender("Female");
        String expected  = "Female";
        String actual = p1.getGender();
        Assert.assertEquals(expected, actual );
    }
}
