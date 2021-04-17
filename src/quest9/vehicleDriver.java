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
public class vehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question9 example1: sai kiran reddy Enugala");
         Car car = new Car();
        car.changeGear(4);
        car.speedUp(3);
        car.applyBrakes(2);
          
        System.out.println("Car present details :");
        car.printDetails();
          
        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(3);
        bike.speedUp(4);
        bike.applyBrakes(1);
          
        System.out.println("Bike present state :");
        bike.printDetails();
    }
    
}
