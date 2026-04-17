/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hi
 */
public class Smartphone extends Device {
    private String os;
    
    public Smartphone(String brand, int price, String os) { 
        super(brand, price); 
        this.os = os; 
    }
    
    @Override public void turnOn() { System.out.println("Smartphone screen is turning on..."); }
    
    @Override public String toString() { return super.toString() + ", OS: " + os; }
}

/* --- KUMPULAN FRAGMEN (HATI-HATI ADA JEBAKAN!) --- */

// // A: extends

// // B: private String os;

// // C: public Smartphone(String brand, int price, String os) { super(brand, price); this.os = os; }

// // D: @Override public void turnOn() { System.out.println("Smartphone screen is turning on..."); }

// // E: @Override public String toString() { return super.toString() + ", OS: " + os; }

// // F: public Smartphone(String brand, int price, String os) { this.os = os; super(brand, price); }

// // G: private int os; 

// // H: public String turnOn() { return "Smartphone On"; }
