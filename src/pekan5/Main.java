/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan5;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
        SegiEmpat p=new SegiEmpat(10);
        SegiEmpat pp=new SegiEmpat(30,20);
        
        System.out.println("Persegi: ");
        System.out.println("Luas        : "+p.getLuas());
        System.out.println("Keliling    : "+p.getKeliling());
        
        System.out.println("\nPersegi Panjang: ");
        System.out.println("Luas        : "+pp.getLuas());
        System.out.println("Keliling    : "+pp.getKeliling());
    }
}
