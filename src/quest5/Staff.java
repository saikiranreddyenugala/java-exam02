/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest5;

import java.util.Date;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Staff extends Employee {

    private String tittle;

    public Staff(String tittle, String Office, double salary, Date dateHired, String name, String address, String number, String Email) {
        super(Office, salary, dateHired, name, address, number, Email);
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    @Override
    public String toString() {
        return "\nStaff:" + "\nName:" + super.getName();
    }

}
