/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest7ex2;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public enum Shoes {
    
    CASUAL(1200),FORMAL(2000),SPORTS(3000);
    private int cost;

    private Shoes(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    
}
