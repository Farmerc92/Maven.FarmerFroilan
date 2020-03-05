package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.Tomato;

public class TomatoPlant extends Crop implements Produce {


    public Tomato yield() {

        if (fertilized && harvested) {
            Tomato tomato = new Tomato();
            return tomato ;
        } else { return null;}
    }
}
