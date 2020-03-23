package Lesson6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private int plateNumber, xLocation, yLocation, speed;

    public Car(){
        plateNumber = 25833;
        xLocation = 311;
        yLocation = 685;
        speed = 60;
    }

    public Car(int p){
        plateNumber = p;
        xLocation = 311;
        yLocation = 685;
        speed = 60;
    }

    public Car(int p, int x){
        plateNumber = p;
        xLocation = x;
        yLocation = 685;
        speed = 60;
    }

    public Car(int p, int x, int y){
        plateNumber = p;
        xLocation = x;
        yLocation = y;
        speed = 60;
    }

    public Car(int p, int x, int y, int s){
        plateNumber = p;
        xLocation = x;
        yLocation = y;
        speed = s;
    }

    public long move(){
        return speed;
    }
    public int park1(){
        return xLocation;
    }
    public int park2(){
        return yLocation;
    }
    public int accelerate(){
        return 123;
    }
}
