package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.food.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FoodStorage {

    protected Map<String, ArrayList<Edible>> store;

    public FoodStorage(){
        store = new HashMap<>();
        store.put("Carrots", new ArrayList<>());
        store.put("Onions", new ArrayList<>());
        store.put("Eggs", new ArrayList<>());
        store.put("Potatoes", new ArrayList<>());
        store.put("Tomatoes", new ArrayList<>());
        store.put("Corn", new ArrayList<>());
    }

    public Map<String, ArrayList<Edible>> getStore() {
        return store;
    }

    public void storeCarrot(Carrot... args){
        for (Carrot c : args) {
            store.get("Carrots").add(c);
        }
    }
    public void storeOnion(Onion... args){
        for (Onion o : args) {
            store.get("Onions").add(o);
        }
    }
    public void storeEgg(int num){
        for (int i = 0;i<num;i++) {
            store.get("Eggs").add(new Egg());
        }
    }
    public void storePotato(Potato... args){
        for (Potato p : args) {
            store.get("Potatoes").add(p);
        }
    }
    public void storeTomato(int num){
        for (int i = 0;i<num;i++) {
            store.get("Tomatoes").add(new Tomato());
        }
    }
    public void storeEarCorn(int numOfEars){
        for (int i = 0;i<numOfEars;i++) {
            store.get("Corn").add(new EarCorn());
        }
    }
    public int carrotAmount(){
        return store.get("Carrots").size();
    }
    public int onionAmount(){
        return store.get("Onions").size();
    }
    public int eggAmount(){
        return store.get("Eggs").size();
    }
    public int potatoAmount(){
        return store.get("Potatoes").size();
    }
    public int tomatoAmount(){
        return store.get("Tomatoes").size();
    }
    public int earCornAmount(){
        return store.get("Corn").size();
    }
    public Carrot removeCarrot(){
        return (Carrot) store.get("Carrots").remove(0);
    }
    public Onion removeOnion(){
        return (Onion) store.get("Onions").remove(0);
    }
    public Egg removeEgg(){
        return (Egg) store.get("Eggs").remove(0);
    }
    public Potato removePotato(){
        return (Potato) store.get("Potatoes").remove(0);
    }
    public Tomato removeTomato(){
        return (Tomato) store.get("Tomatoes").remove(0);
    }
    public EarCorn removeEarCorn(){
        return (EarCorn) store.get("Corn").remove(0);
    }
}
