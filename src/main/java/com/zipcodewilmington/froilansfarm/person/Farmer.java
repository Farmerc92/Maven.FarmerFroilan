package com.zipcodewilmington.froilansfarm.person;


import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class Farmer extends Person implements Botanist, Rider{


    public Farmer(String name, String gender) {
        super(name, gender);
    }

    public void eat() {
        System.out.println("Yum!");
    }

    public void dismount(Rideable rideable) {

    }

    public void ride(Rideable rideable) {

    }

    public void Eat() {

    }

    public void MakeNoise() {

    }

    public String makeNoise() { return "Howdy Partner"; }

    @Override
    public void plant(Crop cropType, CropRow rowNumber) {
        rowNumber.setCropType(cropType);

    }
}
