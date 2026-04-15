/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author hi
 */
public class Student extends Person{
    
    private String department;

    public Student(String name, String noPhone,String department) {
        super(name, noPhone);
        this.department = department;
    }

    @Override
    public void eat() {
        System.out.println("GRAAAWMM");
    }
    
    
}
