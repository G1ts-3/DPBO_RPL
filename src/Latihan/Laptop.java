/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hi
 */
public class Laptop extends Device {
    private int ramSize; 

    public Laptop(String brand, int price, int ramSize) { super(brand, price); this.ramSize = ramSize; }
    
    @Override public void turnOn() { System.out.println("Laptop is booting up..."); }
    
    @Override public String toString() { return super.toString() + ", RAM: " + ramSize + "GB"; }
}

/* --- KUMPULAN FRAGMEN (HATI-HATI ADA JEBAKAN!) --- */
// // A: private int ramSize;

// // B: @Override public void turnOn() { System.out.println("Laptop is booting up..."); }

// // C: public Laptop(String brand, int price, int ramSize) { super(brand, price); this.ramSize = ramSize; }

// // D: @Override public String toString() { return super.toString() + ", RAM: " + ramSize + "GB"; }

// // E: public void turnOn() { super.turnOn(); }

// // extends

// // Device

// // Smartphone
