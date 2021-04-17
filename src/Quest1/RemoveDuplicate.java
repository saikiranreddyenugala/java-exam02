/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class RemoveDuplicate {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Answer for question 1: sai kiran reddy Enugala");
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(scan.nextInt());
        }
        removeDuplicate(list);
    }
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> val = new ArrayList<>();
        for (Integer value : list) {
            if (!val.contains(value)) {
                val.add(value);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer integer : val) {
            System.out.print(integer + " ");
        }
    }
    
}
