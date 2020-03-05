package com.zipcodewilmington.froilansfarm.person;

import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    Pilot pilot = new Pilot("Joe", "Male");

    @Test
    public void instanceTest1() { Assert.assertTrue(pilot instanceof Rider); }

    @Test
    public void instanceTest2() { Assert.assertTrue(pilot instanceof Person); }

    @ Test
    public void nameTest() {
        String expected = "Joe";
        Assert.assertEquals(expected, pilot.getName());
    }

    @Test
    public void genderTest() {
        String expected = "Male";
        Assert.assertEquals(expected, pilot.getGender());
    }

    @Test
    public void makeNoise() {
        String expected = "Good Morning";
        String actual = pilot.makeNoise();
        Assert.assertEquals(expected,actual);
    }
}
