/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUBES_WG58;

/**
 *
 * @author hi
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WarungApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_foodcourt";
        
        try (Connection conn = DriverManager.getConnection(url, "root", "")) {
            // 1. Ambil semua Tenant
            Statement stTenant = conn.createStatement();
            ResultSet rsTenant = stTenant.executeQuery("SELECT * FROM tenant");

            while (rsTenant.next()) {
                int idT = rsTenant.getInt("id_tenant");
                FoodTenant ft = new FoodTenant(rsTenant.getString("nama_tenant"));

                // 2. Ambil menu buat tiap tenant (Inner Query)
                PreparedStatement psMenu = conn.prepareStatement("SELECT * FROM menu WHERE id_tenant = ?");
                psMenu.setInt(1, idT);
                ResultSet rsMenu = psMenu.executeQuery();

                while (rsMenu.next()) {
                    ft.tambahMenu(new MenuItem(rsMenu.getString("nama_item"), rsMenu.getInt("harga")));
                }
                
                // 3. Tampilkan pake cara OOP
                ft.tampilkanProfil();
            }

        } catch (SQLException e) {
            System.out.println("Gagal konek dongo: " + e.getMessage());
        }
    }
}
