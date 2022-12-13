package com.company;

import com.company.data.Car;
import com.company.data.Plane;
import com.company.data.Ship;

public class Main {

    public static void main(String[] args) {
        Ship ship = new Ship(5L,"Unshinkable");
        System.out.println("Hajó neve: " +ship.getName());

        Car car = new Car();
        car.setName("CarcarNascar");
        car.setId(4L);
        car.setDoorNumbers(5);
        System.out.println("Autó neve: " +car.getName()+" , Ajtók száma: "+car.getDoorNumbers());

        Plane plane = new Plane(6L,"Falcon");
        System.out.println("Repcsi neve: "+plane.getName());

        switch (ship.getType()){
            case SHIP:
                System.out.println("Én egy hajó vagyok");
                break;
            case CAR:
                System.out.println("Én egy autó vagyok");
                break;
            case PLANE:
             System.out.println("Én egy repcsi vagyok");
             break;
        }
    }
}