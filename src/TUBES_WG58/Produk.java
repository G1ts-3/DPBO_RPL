package TUBES_WG58;

// ==========================================
// C. MODUL PRODUK
// 7. Produk (Abstract Class)
// ==========================================
public abstract class Produk {
    protected String idProduk;
    protected String namaMenu;
    protected double harga;

    public Produk(String idProduk, String namaMenu, double harga) {
        this.idProduk = idProduk;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    // Method Abstract
    public abstract void ambilDetail();

    // Getter & Setter (Encapsulation)
    public String getIdProduk() { return idProduk; }
    public void setIdProduk(String idProduk) { this.idProduk = idProduk; }
    public String getNamaMenu() { return namaMenu; }
    public void setNamaMenu(String namaMenu) { this.namaMenu = namaMenu; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}
