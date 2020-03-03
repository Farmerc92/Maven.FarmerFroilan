package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Egg;

public class Chicken extends Animal implements Produce {

    public Egg yield(){
        return new Egg();
    }

    public boolean isYeoild() {
        return false;
    }

    public boolean storeFood() {
        return false;
    }

    public void Eat() {
    }

    public void MakeNoise() {
    }
}