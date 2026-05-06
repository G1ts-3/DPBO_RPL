package TUBES_WG58;

// ==========================================
// E. MODUL PEMBAYARAN
// 17. PembayaranTunai (extends Pembayaran)
// ==========================================
public class PembayaranTunai extends Pembayaran {
    private double uangDiterima;

    public PembayaranTunai(String idPembayaran, double totalBayar, double uangDiterima) {
        super(idPembayaran, totalBayar);
        this.uangDiterima = uangDiterima;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("[Kasir] Memproses pembayaran Tunai sebesar Rp" + uangDiterima);
    }

    public double hitungKembalian() {
        double kembali = uangDiterima - totalBayar;
        System.out.println("[Kasir] Kembalian Anda: Rp" + kembali);
        return kembali;
    }

    // Getter & Setter (Encapsulation)
    public double getUangDiterima() { return uangDiterima; }
    public void setUangDiterima(double uangDiterima) { this.uangDiterima = uangDiterima; }
}
