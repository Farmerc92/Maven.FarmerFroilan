package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Tomato;

import java.util.ArrayList;

public class CarrotRoot extends Crop implements Produce {


    public Carrot yield() {

        if (fertilized && harvested) {
            Carrot carrot = new Carrot();
            return carrot ;
        } else { return null;}
    }
}
