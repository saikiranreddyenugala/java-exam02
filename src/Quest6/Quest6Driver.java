/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest6;

import java.util.Scanner;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Quest6Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question6 : sai kiran reddy Enugala");
        Scanner scan = new Scanner(System.in);
        boolean a = false;
        double side1 = 0, side2 = 0, side3 = 0;

        do {
            a = false;

            System.out.println("Enter side1 of triangle:");
            side1 = scan.nextDouble();

            System.out.println("Enter side2 of triangle:");
            side2 = scan.nextDouble();

            System.out.println("Enter side3 of triangle:");
            side3 = scan.nextDouble();

            if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
                System.out.println("sum of any two sides in triangle should be "
                        + " greater than third side, enter again");
                a = true;
            }
        } while (a == true);
        Triangle triangle = new Triangle(side1, side2, side3, "green", true);

        System.out.println(triangle);

    }

}
