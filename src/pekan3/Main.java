/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan3;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.id="321";
        //System.out.println("Id Employee 1 : "+em1.id);
        
        Employee em2 = new Employee("123","Budi","Goatline",5000,2);
        em2.printData("081", "Asep");
        em2.printData(4000, 3);
        
        
    }
}
