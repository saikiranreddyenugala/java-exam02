/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class quest3Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Answer for question 3: sai kiran reddy Enugala");
        ArrayList<Object>newList = new ArrayList<>();
        
        String s1 = "sai";
        Date Date = new Date();
        Loan l1 = new Loan("Student Loan",4000,4.0,12);
        Circle c1= new Circle(3.0);
        newList.add(s1);
        newList.add(Date);
        newList.add(l1);
        newList.add(c1);
        
        for (Object object : newList) {
            System.out.println(object);
            System.out.println("*****************");
        }
        
        
    }
    
}
