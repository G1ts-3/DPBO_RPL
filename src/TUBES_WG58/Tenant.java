/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUBES_WG58;

/**
 *
 * @author hi
 */
public abstract class Tenant {
    protected String namaTenant;
    
    public Tenant(String nama) {
        this.namaTenant = nama;
    }
    
    public abstract void tampilkanProfil(); // Method abstract yg wajib di-override
}
