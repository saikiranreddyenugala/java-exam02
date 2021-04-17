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
public class Faculty extends Employee{
    private final double officeHours;
    private final int noOfTeachingSubjects;

    public Faculty(double officeHours, int noOfTeachingSubjects, String Office, double salary, Date dateHired, String name, String address, String number, String Email) {
        super(Office, salary, dateHired, name, address, number, Email);
        this.officeHours = officeHours;
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }

   

    public double getOfficeHours() {
        return officeHours;
    }

    public int getNoOfTeachingSubjects() {
        return noOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return "\nFaculty:" + "\nName:" + super.getName();
    }
    
    
    
}
