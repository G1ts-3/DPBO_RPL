/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

/**
 *
 * @author hi
 */
public class CarTest {
    public static void main(String[] args) {
        Washer car=new Car();
        
        Car taxi=new Taxi();
        Car truck= new Truck();
        
        car.wash();
        System.out.println("Taxi");
        taxi.wash();
        System.out.println("Truck");
        truck.wash();
    }
}
