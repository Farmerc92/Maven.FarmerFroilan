package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Egg;

public class Chicken extends Animal implements Produce {



    public Egg yield() {
       Egg newEgg = new Egg();

        return newEgg;
    }

    public Boolean storeFood() {
        return false;
    }


    public void eat() {
    }

    public String makeNoise() {
        return "Bawwwk buk buk buk buk buk BCAW!";
    }
}
