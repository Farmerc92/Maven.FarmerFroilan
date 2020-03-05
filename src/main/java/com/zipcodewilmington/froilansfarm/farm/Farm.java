package com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;
import java.util.ArrayList;


public class Farm {

    ArrayList<Stable> stables = new ArrayList<Stable>();
    ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    CropDuster cropDuster;
    Tractor tractor;
    Field farmField = new Field();
    FarmHouse farmhouse = new FarmHouse();
    Farmer farmer;
    Pilot pilot;

    public Farm(Integer numOfStables, Integer numOfCoops, Farmer farmer, Pilot pilot){

        this.farmer = farmer;
        this.pilot = pilot;
        setUpStables(numOfStables);
        setUpCoops(numOfCoops);
    }

    // ********************************************************************************    Horses & Stables   **********
    public void setUpStables(Integer numOfstables){
        for(int x = 1; x <= numOfstables; x++){
            Stable newStab = new Stable();
            stables.add(newStab);
        }
    }
    public void setHorsesInStable(Integer stableNum, Integer numOfHorses){
        if(stableNum <= 0){

        }else {
            this.stables.get(stableNum -1).addHorses(numOfHorses);
        }
    }
    public Stable getStable(Integer stableNum){
        return this.stables.get(stableNum -1);
    }
    public ArrayList<Stable> getAllStables(){
        return this.stables;
    }
    public Integer getNumOfStables(){
        return this.stables.size();
    }

    // ********************************************************************************    Chickens & coops   **********
    public void setUpCoops(Integer numOfCoops){
        for(int x = 1; x <= numOfCoops; x++){
            ChickenCoop newCoop = new ChickenCoop();
            chickenCoops.add(newCoop);
        }
    }
    public void setChickensInCoop(Integer coopNum, Integer numOfChickens){
        if(coopNum <= 0){

        }else {
            this.chickenCoops.get(coopNum -1).addChickens(numOfChickens);
        }
    }
    public ChickenCoop getChickenCoop(Integer coopNum){
        return this.chickenCoops.get(coopNum -1);
    }
    public ArrayList<ChickenCoop> getAllCoops(){
        return this.chickenCoops;
    }
    public Integer getNumOfCoops(){
        return this.chickenCoops.size();
    }

    // ********************************************************************************
    public Farmer getFarmer(){
        return this.farmer;
    }
    public Pilot getPilot(){
        return this.pilot;
    }
    public Tractor getTractor(){
        return this.tractor;
    }
    public CropDuster getCropDuster(){
        return this.cropDuster;
    }


}
