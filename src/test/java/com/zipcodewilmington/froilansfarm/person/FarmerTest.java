package com.zipcodewilmington.froilansfarm.person;


import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    Farmer farmer = new Farmer("joe", "Female");

    @Test
    public void instanceTest1() { Assert.assertTrue(farmer instanceof Botanist); }

    @Test
    public void instanceTest2() { Assert.assertTrue(farmer instanceof Rider); }

    @Test
    public void instanceTest3() { Assert.assertTrue(farmer instanceof Person);}

    @ Test
    public void nameTest() {
        String expected = "joe";
        Assert.assertEquals(expected, farmer.getName());
    }

    @Test
    public void genderTest() {
        String expected = "Female";
        Assert.assertEquals(expected, farmer.getGender());
    }

    @Test
    public void makeNoise() {
        String expected = "Howdy Partner";
        String actual = farmer.makeNoise();
        Assert.assertEquals(expected,actual);
    }



}
