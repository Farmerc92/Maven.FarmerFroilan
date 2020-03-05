package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.farm.FoodStorage;
import com.zipcodewilmington.froilansfarm.food.*;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Rider;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Tractor extends Vehicle implements FarmVehicle, Rideable {

    private static final Logger LOGGER = Logger.getLogger(Tractor.class.getName());

    private Rider rider;
    public FoodStorage storage = new FoodStorage();

    public Tractor(Rider rider){
        this.rider = rider;
    }

    public void operate(Field field) {
        if (!(rider instanceof Farmer)){
            LOGGER.info("\nOnly a farmer can operate this!");
        }
        else {
            for (Integer i = 1; i < 6; i++) {
                CropRow tempRow = field.getCropRow(i);
                ArrayList<Crop> row = tempRow.getRow();
                for (int j = 0; j < 5; j++) {
                    row.get(j).setHarvested(true);
                    if (row.get(j) instanceof CornStalk){
                        EarCorn earCorn = ((CornStalk) row.get(j)).yield();
                        storage.storeEarCorn(1);
                    }
                    else if (row.get(j) instanceof CarrotRoot){
                        Carrot carrot = ((CarrotRoot) row.get(j)).yield();
                        storage.storeCarrot(carrot);
                    }
                    else if (row.get(j) instanceof OnionRoot){
                        Onion onion = ((OnionRoot) row.get(j)).yield();
                        storage.storeOnion(onion);
                    }
                    else if (row.get(j) instanceof PotatoRoot){
                        Potato potato = ((PotatoRoot) row.get(j)).yield();
                        storage.storePotato(potato);
                    }
                    else if (row.get(j) instanceof TomatoPlant){
                        Tomato tomato = ((TomatoPlant) row.get(j)).yield();
                        storage.storeTomato(1);
                    }
                }
            }
        }
    }

    public String makeNoise() {
        return " bum bum";

    }
}
