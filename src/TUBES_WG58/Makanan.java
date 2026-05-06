package TUBES_WG58;

// ==========================================
// C. MODUL PRODUK
// 8. Makanan (extends Produk)
// ==========================================
public class Makanan extends Produk {
    private boolean pedas;

    public Makanan(String idProduk, String namaMenu, double harga, boolean pedas) {
        super(idProduk, namaMenu, harga);
        this.pedas = pedas;
    }

    @Override
    public void ambilDetail() {
        System.out.println("[Menu] Makanan: " + namaMenu + " | Rp" + harga + " | Pedas: " + (pedas ? "Ya" : "Tidak"));
    }

    // Getter & Setter (Encapsulation)
    public boolean isPedas() { return pedas; }
    public void setPedas(boolean pedas) { this.pedas = pedas; }
}
