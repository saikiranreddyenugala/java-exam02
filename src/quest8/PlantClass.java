/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest8;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class PlantClass extends plants {

    public PlantClass(String plantType) {
        super(plantType);
    }
    
    @Override
    String PlantFamily() {
      return super.getPlantType();
    }

    @Override
    public String toString() {
        return "PlantClass " + super.getPlantType();
    }  
    
}
