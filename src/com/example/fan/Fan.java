package com.example.fan;

import static com.example.fan.Direction.*;

public class Fan {

    private Direction direction = CLOCKWISE;
    public static final int OFF = 0;
    private int speed = OFF;

    public Direction getDirection(){
        return direction;
    }
    public int getSpeed(){
        return speed;
    }
    //speed increase by 1 each time it gets called, if speed is 3 then set to 0
    public void increaseSpeed(){
        if(speed<3 && speed>=0){
            speed++;
        }else {
            speed = OFF;
        }
    }
    //reverse the direction of the fan
    public void reverse(){
        if(direction == CLOCKWISE){
            direction = COUNTERCLOCKWISE;
        }else {
            direction = CLOCKWISE;
        }
    }


}
