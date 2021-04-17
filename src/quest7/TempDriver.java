/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest7;

import java.awt.BorderLayout;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class TempDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Answer for question7 example1: sai kiran reddy Enugala");
        System.out.println("HOT");
        System.out.println("COLD");
        System.out.println("WARM");
        System.out.println(Temperature.HOT.getTemp());
        System.out.println(Temperature.COLD.getTemp());
        System.out.println(Temperature.WARM.getTemp());
        System.out.println("The length of enums temperature is :"+Temperature.values().length);
        
    }
    
}
