package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.food.*;
import org.junit.Assert;
import org.junit.Test;

public class FoodStorageTest {

    FoodStorage storage = new FoodStorage();

    @Test
    public void storeCarrot() {
        Carrot carrot = new Carrot();
        storage.storeCarrot(carrot);
        Assert.assertEquals(1, storage.carrotAmount());
    }

    @Test
    public void storeOnion() {
        Onion onion = new Onion();
        storage.storeOnion(onion);
        Assert.assertEquals(1, storage.onionAmount());
    }

    @Test
    public void storeEgg() {
        Egg egg = new Egg();
        storage.storeEgg(1);
        Assert.assertEquals(1, storage.eggAmount());
    }

    @Test
    public void storePotato() {
        Potato potato = new Potato();
        storage.storePotato(potato);
        Assert.assertEquals(1, storage.potatoAmount());
    }

    @Test
    public void storeTomato() {
        Tomato tomato = new Tomato();
        storage.storeTomato(1);
        Assert.assertEquals(1, storage.tomatoAmount());
    }

    @Test
    public void storeEarCorn() {
        EarCorn earCorn = new EarCorn();
        storage.storeEarCorn(1);
        Assert.assertEquals(1, storage.earCornAmount());
    }

    @Test
    public void removeCarrot() {
        Carrot carrot = new Carrot();
        storage.storeCarrot(carrot);
        storage.removeCarrot();
        Assert.assertEquals(0, storage.carrotAmount());
    }

    @Test
    public void removeOnion() {
        Onion onion = new Onion();
        storage.storeOnion(onion);
        storage.removeOnion();
        Assert.assertEquals(0, storage.onionAmount());
    }

    @Test
    public void removeEgg() {
        Egg egg = new Egg();
        storage.storeEgg(1);
        storage.removeEgg();
        Assert.assertEquals(0, storage.eggAmount());
    }

    @Test
    public void removePotato() {
        Potato potato = new Potato();
        storage.storePotato(potato);
        storage.removePotato();
        Assert.assertEquals(0, storage.potatoAmount());
    }

    @Test
    public void removeTomato() {
        Tomato tomato = new Tomato();
        storage.storeTomato(1);
        storage.removeTomato();
        Assert.assertEquals(0, storage.tomatoAmount());
    }

    @Test
    public void removeEarCorn() {
        EarCorn earCorn = new EarCorn();
        storage.storeEarCorn(1);
        storage.removeEarCorn();
        Assert.assertEquals(0, storage.earCornAmount());
    }
}
