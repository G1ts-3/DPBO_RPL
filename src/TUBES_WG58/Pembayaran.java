package TUBES_WG58;

// ==========================================
// E. MODUL PEMBAYARAN
// 16. Pembayaran (Abstract Class)
// ==========================================
public abstract class Pembayaran {
    protected String idPembayaran;
    protected double totalBayar;

    public Pembayaran(String idPembayaran, double totalBayar) {
        this.idPembayaran = idPembayaran;
        this.totalBayar = totalBayar;
    }

    // Method Abstract
    public abstract void prosesPembayaran();

    // Getter & Setter (Encapsulation)
    public String getIdPembayaran() { return idPembayaran; }
    public void setIdPembayaran(String idPembayaran) { this.idPembayaran = idPembayaran; }
    public double getTotalBayar() { return totalBayar; }
    public void setTotalBayar(double totalBayar) { this.totalBayar = totalBayar; }
}
