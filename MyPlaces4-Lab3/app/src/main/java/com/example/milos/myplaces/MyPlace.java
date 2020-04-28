package com.example.milos.myplaces;

/**
 * Created by Milos on 4/26/2020.
 */

public class MyPlace {
    String name;
    String description;
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
}
