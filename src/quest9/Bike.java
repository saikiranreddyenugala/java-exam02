/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest9;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Bike implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

     @Override
    public void speedUp(int speedIncrement) {
        speed = speed + speedIncrement; 
    }

    @Override
    public void applyBrakes(int speedDecrement ) {
        speed = speed + speedDecrement;
    }
     public void printDetails() {
         System.out.println("speed: " + speed
              + " gear: " + gear);
    }
    
}
