/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest6;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;  

    public Triangle(double side1, double side2, double side3, String colour, boolean colorField) {
        super(colour, colorField);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    

    @Override
    public double calculateArea() {
        double s = calculatePerimeter()/2;
       double area = Math.round(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)))*100/100.0;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        return Math.round((side1+ side2+side3)*100)/100.0;
       
    }

    @Override
    public String toString() {
        return "Area:"+ this.calculateArea() +"\nPerimeter:"+ this.calculatePerimeter()+
                "\nColor:"+ super.getColor()+"\nColors filled?"+super.isColorField();
    }
    
    
    
    
}
