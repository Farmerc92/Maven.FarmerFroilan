package com.zipcodewilmington.froilansfarm.crop;

public abstract class Crop {
    boolean harvested;
    boolean fertilized;

    public void setHarvested(boolean harvested) {
        this.harvested = harvested;
    }

    public void setFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }

    public boolean isFertilized(){
        return fertilized;
    }

    public boolean isHarvested(){
        return harvested;
    }
}
