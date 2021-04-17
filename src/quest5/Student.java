/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest5;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Student extends Person {

    public double grade;
    public final static String Class_status = "Graduate";

    public Student(double grade, String name, String address, String number, String Email) {
        super(name, address, number, Email);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "\nStudent:" + "\nName:" + super.getName();
    }

}
