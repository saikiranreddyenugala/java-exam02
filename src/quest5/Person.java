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
public class Person {

    private String name;
    private String address;
    private String number;
    private String Email;

    public Person(String name, String address, String number, String Email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.Email = Email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public String toString() {
        return "Person:" + "\nname:" + name;
    }

}
