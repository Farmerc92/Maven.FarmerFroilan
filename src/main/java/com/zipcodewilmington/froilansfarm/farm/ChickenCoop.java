package com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.animal.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    ArrayList<Chicken> chickens = new ArrayList<Chicken>();


    public void addChickens(Integer numOfChickens){
        Chicken genericChicken = new Chicken();

        for(int x = 1; x <= numOfChickens; x++){
            chickens.add(genericChicken);
        }
    }
    public ArrayList<Chicken> getChickens(){
        return this.chickens;
    }

    public void removeChicken(Integer numToRemove){

        if(numToRemove > this.chickens.size() || numToRemove <= 0){
            //do nothing
        }else {
            for(int x = 1; x<= numToRemove; x++){
                chickens.remove(chickens.size()-1);
            }
        }
    }
    public Integer getNumOfChickens(){
        return this.chickens.size();
    }
}
