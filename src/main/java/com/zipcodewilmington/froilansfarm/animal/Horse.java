package com.zipcodewilmington.froilansfarm.animal;


import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.farm.FoodStorage;
import com.zipcodewilmington.froilansfarm.food.Food;
import com.zipcodewilmington.froilansfarm.person.Person;

public class Horse extends Animal implements Rideable, Eater {
    private Person rider;

    public Person getRider() {
        return rider;
    }

    public void setRider(Person rider) {
        this.rider = rider;
    }


    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public void eat() {
    }
}

