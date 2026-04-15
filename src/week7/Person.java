/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author hi
 */
public class Person {
    private String name, noPhone;

    public Person(String name, String noPhone) {
        this.name = name;
        this.noPhone = noPhone;
    }
    
    public void eat(){
        System.out.println("Nyam nyam");
    }
    public void sleep(){
        System.out.println("zzz.. zzz..");
    }
}
