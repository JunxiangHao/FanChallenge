package com.example.test;

import com.example.fan.Direction;
import com.example.fan.Fan;
import org.junit.jupiter.api.Test;

import static com.example.fan.Fan.OFF;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FanTest {
    private Fan fan;
    @Test
    public void testSpeed(){
        fan = new Fan();
        //increase the speed
        assertEquals(fan.getSpeed(),OFF);
        assertEquals(fan.getDirection(), Direction.CLOCKWISE);
        fan.increaseSpeed();
        assertEquals(fan.getSpeed(),1);
        assertEquals(fan.getDirection(), Direction.CLOCKWISE);
        fan.increaseSpeed();
        assertEquals(fan.getSpeed(),2);
        assertEquals(fan.getDirection(), Direction.CLOCKWISE);
        fan.increaseSpeed();
        assertEquals(fan.getSpeed(),3);
        assertEquals(fan.getDirection(), Direction.CLOCKWISE);
        fan.increaseSpeed();
        assertEquals(fan.getSpeed(),OFF);
        assertEquals(fan.getDirection(), Direction.CLOCKWISE);
    }
    @Test
    public void testDirection(){
        fan = new Fan();
        //increase the  speed and keep the direction after reverse the fan
        fan.reverse();
        assertEquals(fan.getDirection(), Direction.COUNTERCLOCKWISE);
        assertEquals(fan.getSpeed(),OFF);
        fan.increaseSpeed();
        assertEquals(fan.getDirection(), Direction.COUNTERCLOCKWISE);
        assertEquals(fan.getSpeed(),1);
        fan.increaseSpeed();
        assertEquals(fan.getDirection(), Direction.COUNTERCLOCKWISE);
        assertEquals(fan.getSpeed(),2);
        fan.increaseSpeed();
        assertEquals(fan.getDirection(), Direction.COUNTERCLOCKWISE);
        assertEquals(fan.getSpeed(),3);
        fan.increaseSpeed();
        assertEquals(fan.getDirection(), Direction.COUNTERCLOCKWISE);
        assertEquals(fan.getSpeed(),OFF);
        //reverse again and increase the speed
        fan.reverse();
        assertEquals(fan.getDirection(), Direction.CLOCKWISE);
        assertEquals(fan.getSpeed(),OFF);
        fan.increaseSpeed();
        assertEquals(fan.getDirection(), Direction.CLOCKWISE);
        assertEquals(fan.getSpeed(),1);

    }

}
