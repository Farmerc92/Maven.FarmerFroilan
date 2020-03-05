package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.Onion;

public class OnionRoot extends Crop implements Produce {

    public Onion yield() {

        if (fertilized && harvested) {
            Onion onion = new Onion();
            return onion;
        } else { return null;}
    }
}

