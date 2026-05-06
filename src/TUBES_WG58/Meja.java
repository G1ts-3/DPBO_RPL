package TUBES_WG58;

// ==========================================
// D. MODUL PESANAN
// 15. Meja
// ==========================================
public class Meja {
    private int noMeja;
    private boolean tersedia;

    public Meja(int noMeja, boolean tersedia) {
        this.noMeja = noMeja;
        this.tersedia = tersedia;
    }

    public void aturKetersediaan(boolean b) {
        this.tersedia = b;
        System.out.println("[Fasilitas] Meja " + noMeja + " statusnya diubah menjadi: " + (b ? "Tersedia" : "Terisi"));
    }

    // Getter & Setter (Encapsulation)
    public int getNoMeja() { return noMeja; }
    public void setNoMeja(int noMeja) { this.noMeja = noMeja; }
    public boolean isTersedia() { return tersedia; }
    public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }
}
