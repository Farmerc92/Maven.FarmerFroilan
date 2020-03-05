package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.EarCorn;

public class CornStalk extends Crop implements Produce {


    public EarCorn yield() {

        if (fertilized && harvested) {
            EarCorn earCorn = new EarCorn();
            return earCorn;
        } else { return null;}
    }

}
