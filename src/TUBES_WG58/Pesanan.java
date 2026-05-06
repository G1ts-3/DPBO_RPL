package TUBES_WG58;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// ==========================================
// D. MODUL PESANAN
// 11. Pesanan (Abstract Class)
// Menerapkan Method Overloading pada tambahMenu()
// ==========================================
public abstract class Pesanan {
    protected String idPesanan;
    protected Date tanggal;
    protected String status;
    protected List<ItemPesanan> daftarItem;

    public Pesanan(String idPesanan, Date tanggal, String status) {
        this.idPesanan = idPesanan;
        this.tanggal = tanggal;
        this.status = status;
        this.daftarItem = new ArrayList<>();
    }

    // Method Abstract
    public abstract double hitungTotal();

    // METHOD OVERLOADING 1: Tambah menu default 1 porsi
    public void tambahMenu(Produk p) {
        daftarItem.add(new ItemPesanan(1, p.getHarga()));
        System.out.println("[Keranjang] 1x " + p.getNamaMenu() + " ditambahkan ke pesanan " + idPesanan);
    }

    // METHOD OVERLOADING 2: Tambah menu dengan jumlah tertentu
    public void tambahMenu(Produk p, int jumlah) {
        daftarItem.add(new ItemPesanan(jumlah, p.getHarga() * jumlah));
        System.out.println("[Keranjang] " + jumlah + "x " + p.getNamaMenu() + " ditambahkan ke pesanan " + idPesanan);
    }

    // Getter & Setter (Encapsulation)
    public String getIdPesanan() { return idPesanan; }
    public void setIdPesanan(String idPesanan) { this.idPesanan = idPesanan; }
    public Date getTanggal() { return tanggal; }
    public void setTanggal(Date tanggal) { this.tanggal = tanggal; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public List<ItemPesanan> getDaftarItem() { return daftarItem; }
}
