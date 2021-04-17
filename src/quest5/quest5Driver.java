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
public class quest5Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 5: sai kiran reddy Enugala");
        Person person = new Person("sai","india","123456789","sai@gmail.com");
        Student student = new Student(4.0,"kiran","maryville","1234567890","kiran@gmail.com");
        Employee employee = new Employee("google",2504.0,new Date(10,10, 04),"saikiran","missouri",
        "231434633","saikiran@gmail.com");
        Faculty faculty = new Faculty(20.0, 3, "accenture", 235534.0,
                new Date(12, 12, 5), "sai", "UnitedStates", "6534234765", 
                "asadf@gmail.com"); 
        Staff staff= new Staff("fullstack","Dell", 324324, new Date(20, 2, 3),
                    "rohith sharma", "Mumbai", "123242542", "hitman@gmail.com");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
        
       
        
        
    }
    
}
