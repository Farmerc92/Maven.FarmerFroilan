package com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.animal.Horse;

import java.util.ArrayList;

public class Stable{

    ArrayList<Horse> horses = new ArrayList<Horse>();


    public void addHorses(Integer numOfHorses){
        Horse genericHorse = new Horse();

        for(int x = 1; x <= numOfHorses; x++){
            horses.add(genericHorse);
        }
    }
    public ArrayList<Horse> getHorsesList(){
        return this.horses;
    }

    public void removeHorses(Integer numToRemove){

        if(numToRemove > this.horses.size() || numToRemove <= 0){
            //do nothing
        }else {
            for(int x = 1; x<= numToRemove; x++){
                horses.remove(horses.size()-1);
            }
        }
    }
    public Integer getNumOfHorses(){
        return this.horses.size();
    }
}
