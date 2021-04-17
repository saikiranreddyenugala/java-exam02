/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest4;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Apollo extends Pharmacy {
    private double stock;

    public Apollo(double stock, String pharmaName) {
        super(pharmaName);
        this.stock = stock;
    }
    
    public double dailyStock() {
        return 30.3;
    }

    @Override
    public String toString() {
        return super.getPharmaName()+" has stock of " + stock +"new medicines";
    }
    

    
}
