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
public abstract class GeometricObject {
    
    private String color;
    private boolean colorField;

    public GeometricObject(String color, boolean colorField) {
        this.color = color;
        this.colorField = colorField;
    }

    public String getColor() {
        return color;
    }

    public boolean isColorField() {
        return colorField;
    }
    
   public abstract double calculateArea();
   public abstract double calculatePerimeter();
    
    
}
