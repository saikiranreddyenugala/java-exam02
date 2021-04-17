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
public class Pharmacy {
        private String pharmaName;

    public Pharmacy(String pharmaName) {
        this.pharmaName = pharmaName;
    }

    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }

    @Override
    public String toString() {
        return "Pharmacy{" + "pharmaName=" + pharmaName + '}';
    }


}
