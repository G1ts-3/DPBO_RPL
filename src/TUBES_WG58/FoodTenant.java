/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUBES_WG58;

/**
 *
 * @author hi
 */
import java.util.ArrayList;
import java.util.List;

public class FoodTenant extends Tenant {
    private List<MenuItem> daftarMenu = new ArrayList<>();

    public FoodTenant(String nama) {
        super(nama);
    }

    public void tambahMenu(MenuItem item) {
        daftarMenu.add(item);
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("\n=== TENANT: " + namaTenant.toUpperCase() + " ===");
        for (MenuItem m : daftarMenu) {
            System.out.println("- " + m.getNama() + " (Rp" + m.getHarga() + ")");
        }
    }
}
