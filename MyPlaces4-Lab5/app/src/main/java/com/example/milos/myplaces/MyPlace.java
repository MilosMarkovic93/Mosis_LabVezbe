package com.example.milos.myplaces;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Milos on 4/26/2020.
 */

@IgnoreExtraProperties
public class MyPlace {
    public String name;
    public String description;
    public String longitude;
    public String latitude;
    @Exclude
    public String key;
    public MyPlace(){}
    int ID;

    public String getLongitude(){
        return longitude;
    }
    public String getLatitude(){
        return latitude;
    }

    public void setLongitude(String longitude){
        this.longitude=longitude;
    }
    public void setLatitude(String latitude){
        this.latitude=latitude;
    }


    public MyPlace(String name, String desc){
        this.name=name;
        this.description=desc;
    }
    public MyPlace(String nme){
        this(nme,"");
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String desc){
        this.description=desc;
    }
    @Override
    public String toString(){
        return this.name;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
}
