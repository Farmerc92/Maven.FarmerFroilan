package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.person.Rider;

public abstract class Aircraft extends Vehicle implements Flyable {

    protected boolean isFlying;

    public Aircraft(Rider rider){
        isFlying = false;
        this.rider = rider;
    }

    public boolean fly() {
        this.isFlying = true;
        return true;
    }

    public boolean land(){
        this.isFlying = false;
        return false;
    }

}
