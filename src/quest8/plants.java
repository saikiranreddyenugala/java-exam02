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
public abstract class plants {
    
    private String plantType;

    public plants(String plantType) {
        this.plantType = plantType;
    }

    public String getPlantType() {
        return plantType;
    }
    
    
    abstract String PlantFamily();
    
    
}
