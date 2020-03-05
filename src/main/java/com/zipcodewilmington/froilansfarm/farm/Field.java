package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;

import java.security.PublicKey;

public class Field {
    CropRow row1 = new CropRow();
    CropRow row2 = new CropRow();
    CropRow row3 = new CropRow();
    CropRow row4 = new CropRow();
    CropRow row5 = new CropRow();

    public Field(){
    }

    public CropRow getCropRow(Integer rowNum){
        if(rowNum == 1){
            return row1;
        }else if(rowNum == 2){
            return row2;
        }else if(rowNum == 3){
            return row3;
        }else if(rowNum == 4){
            return row4;
        }else if(rowNum == 5){
            return row5;
        }else{
            return null;
        }
    }

    public void setCropRow(Integer rowNum, Crop cropType){

        if(rowNum == 1){
            row1.setCropType(cropType);
        }else if(rowNum == 2){
            row2.setCropType(cropType);
        }else if(rowNum == 3){
            row3.setCropType(cropType);
        }else if(rowNum == 4){
            row4.setCropType(cropType);
        }else if(rowNum == 5){
            row5.setCropType(cropType);
        }
    }

    public Boolean isEmpty(CropRow rowToCheck){
       if(rowToCheck ==  null){
           return true;
       }else{
           return false;
       }
    }
}

