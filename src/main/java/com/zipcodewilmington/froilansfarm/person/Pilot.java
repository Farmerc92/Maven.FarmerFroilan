package com.zipcodewilmington.froilansfarm.person;


import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.vehicle.Aircraft;

public class Pilot extends Person implements Rider {


    public Pilot(String name, String gender) {
        super(name, gender);
    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void ride(Rideable rideable) {

    }

    public void eat() {
        System.out.println("Yum!");
    }




    public String makeNoise() {
        return "Good Morning";

    }
}