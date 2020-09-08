package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Utils {

    public static ArrayList<Car> generateCars(String rawCarsString){
        ArrayList<Car> carList=new ArrayList<>();
        for(String rawCarString:rawCarsString.split(", ")){
            carList.add(new Car(rawCarString));
        }
        return carList;
    }

    public static HashMap<String, ArrayList<String>>GroupCar(ArrayList<Car> cars){
        HashMap<String,ArrayList<String>> groupedCard = new HashMap<>();
        for(Car car:cars){
            if(groupedCard.containsKey(car.getType())){
                groupedCard.get(car.getType()).add(car.getModel());
            } else{
                ArrayList<String> list = new ArrayList<>();
                list.add(car.getModel());
                groupedCard.put(car.getType(),list);
            }
        }
        return groupedCard;
    }
}
