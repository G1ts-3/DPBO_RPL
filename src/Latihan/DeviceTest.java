/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author hi
 */
import java.util.ArrayList; // Library untuk koleksi dinamis

public class DeviceTest {
    public static void main(String[] args) {
        ArrayList<Device> store = new ArrayList<>();
        
        store.add(new Laptop("Dell", 15000000, 16));
        store.add(new Smartphone("Samsung", 12000000, "Android"));
        
        for (Device d : store) { 
            d.turnOn(); 
            System.out.println(d.toString()); 
        }
    }
}
