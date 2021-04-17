/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest7;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public enum Temperature {
    HOT(40),COLD(2),WARM(25);
    private int temp;
    
    private  Temperature(int temp){
        this.temp=temp;
    }
    
    public int getTemp(){
        return temp;
    }
    

    
    
    
}
