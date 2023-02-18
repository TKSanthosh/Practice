package com.oops.example.motorbike;
import java.util.*;

public class MotorBike {
    private int speed;
    MotorBike(){
        this(5);
    }
    MotorBike(int speed){
        this.speed = speed;
    }

    public void putSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void increaseSpeed(int more){
         putSpeed(this.speed + more);
    }
    public void decreaseSpeed(int more){
       putSpeed(this.speed - more);
    }

}
