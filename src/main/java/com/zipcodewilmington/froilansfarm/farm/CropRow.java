package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.food.Onion;

import java.util.ArrayList;

public class CropRow {
    ArrayList<Crop> row =  new ArrayList<Crop>();

    public void setCropType(Crop type){

        for(int x = 1; x <=5; x++){
            row.add(type);
        }
    }

    public Crop getCrop(){
        Crop nullCrop = null;

        if(row.size() == 0){
            return nullCrop;
        }else{
            return this.row.get(0);
        }
    }

    public ArrayList<Crop> getRow(){
        return row;
    }

    public String checkCropType(){

        Crop crop = this.row.get(0);

        if(crop instanceof CarrotRoot){
            return "Carrot Root";
        }else if(crop instanceof CornStalk){
            return "Corn Stalk";
        }else if(crop instanceof OnionRoot){
            return "Onion Root";
        }else if(crop instanceof PotatoRoot){
            return "Potato Root";
        }else{
            return "Tomato Plant";
        }
    }
}

/*
 if(type instanceof CarrotRoot){
            crop = new CarrotRoot();
        }else if(type instanceof CornStalk){
            crop = new CornStalk();
        }else if(type instanceof OnionRoot){
            crop = new OnionRoot();
        }else if(type instanceof PotatoRoot){
            crop = new PotatoRoot();
        }else{
            crop = new TomatoPlant();
        }
 */