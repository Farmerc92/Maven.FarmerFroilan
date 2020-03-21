package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.Potato;

public class PotatoRoot extends Crop implements Produce {

    public Potato yield() {

        if (fertilized && harvested) {
            Potato potato = new Potato();
            return potato;
        } else { return null;}
    }
}
