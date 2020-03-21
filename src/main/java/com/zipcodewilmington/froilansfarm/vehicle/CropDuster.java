package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.Fertilizer;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.person.Rider;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CropDuster extends Aircraft implements FarmVehicle, Rideable, Fertilizer {

    private static final Logger LOGGER = Logger.getLogger(CropDuster.class.getName());

    public CropDuster(Rider rider){
        super(rider);
    }

    public void operate(Field field) {
        if (!(rider instanceof Pilot)){
            LOGGER.info("\nYou must be a pilot to pilot this!");
        }
        else {
            for (Integer i = 1; i < 6; i++) {
                CropRow tempRow = field.getCropRow(i);
                ArrayList<Crop> row = tempRow.getRow();
                for (int j = 0; j < 5; j++) {
                    row.get(j).setFertilized(true);
                }
            }
        }
    }



    @Override
    public String makeNoise() {
        return "bzzzzzzzzzzz";
    }

    @Override
    public void fertilize(Field field) {
        for (int i=1; i < 6; i++){
            field.getCropRow(i).getCrop().setFertilized(true);

        }

    }
}
