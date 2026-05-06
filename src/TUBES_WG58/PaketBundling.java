package TUBES_WG58;

import java.util.ArrayList;
import java.util.List;

// ==========================================
// C. MODUL PRODUK
// 10. PaketBundling (extends Produk)
// ==========================================
public class PaketBundling extends Produk {
    private double diskon;
    private List<Produk> daftarMenu;

    public PaketBundling(String idProduk, String namaMenu, double harga, double diskon) {
        super(idProduk, namaMenu, harga);
        this.diskon = diskon;
        this.daftarMenu = new ArrayList<>();
    }

    @Override
    public void ambilDetail() {
        System.out.println("[Menu] Paket Bundling: " + namaMenu + " | Harga: Rp" + harga + " | Diskon: Rp" + diskon);
        System.out.println("       Isi Paket:");
        for (Produk p : daftarMenu) {
            System.out.print("       - ");
            p.ambilDetail();
        }
    }

    public void tambahMenu(Produk p) {
        daftarMenu.add(p);
        System.out.println("[Paket] " + p.getNamaMenu() + " ditambahkan ke dalam paket " + namaMenu);
    }

    // Getter & Setter (Encapsulation)
    public double getDiskon() { return diskon; }
    public void setDiskon(double diskon) { this.diskon = diskon; }
    public List<Produk> getDaftarMenu() { return daftarMenu; }
}
