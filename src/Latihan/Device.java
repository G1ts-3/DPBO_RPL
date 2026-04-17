/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hi
 */
public abstract class Device {
    protected String brand; protected int price; 
    
    public Device(String brand, int price) { this.brand = brand; this.price = price; }
    
    public abstract void turnOn(); 
    
    @Override public String toString() { return "Brand: " + brand + ", Price: " + price; }
}
