package com.example.milos.myplaces;

import java.util.ArrayList;

/**
 * Created by Milos on 4/26/2020.
 */

public class MyPlacesData {
    private ArrayList<MyPlace> myPlaces;
    private MyPlacesData(){

    }
    private static class SingletonHolder{
        public static final MyPlacesData instance=new MyPlacesData();
    }
    public static MyPlacesData getInstance(){
        return SingletonHolder.instance;
    }
    public ArrayList<MyPlace> getMyPlaces(){
        return myPlaces;
    }
    public void addNewPlace(MyPlace place){
        myPlaces.add(place);
    }
    public MyPlace getPlace(int index){
        return myPlaces.get(index);
    }

    public void deletePlace(int index){
        myPlaces.remove(index);
    }

}
