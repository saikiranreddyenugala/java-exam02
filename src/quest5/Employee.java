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
public class Employee extends Person {

    private String Office;
    private double salary;
    private Date dateHired;

    public Employee(String Office, double salary, Date dateHired, String name, String address, String number, String Email) {
        super(name, address, number, Email);
        this.Office = Office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return Office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "\nEmployee:" + "\nName:" + super.getName();
    }

}
