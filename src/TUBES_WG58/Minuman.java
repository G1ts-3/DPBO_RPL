package TUBES_WG58;

// ==========================================
// C. MODUL PRODUK
// 9. Minuman (extends Produk)
// ==========================================
public class Minuman extends Produk {
    private boolean dingin;

    public Minuman(String idProduk, String namaMenu, double harga, boolean dingin) {
        super(idProduk, namaMenu, harga);
        this.dingin = dingin;
    }

    @Override
    public void ambilDetail() {
        System.out.println("[Menu] Minuman: " + namaMenu + " | Rp" + harga + " | Dingin: " + (dingin ? "Ya" : "Tidak"));
    }

    // Getter & Setter (Encapsulation)
    public boolean isDingin() { return dingin; }
    public void setDingin(boolean dingin) { this.dingin = dingin; }
}
