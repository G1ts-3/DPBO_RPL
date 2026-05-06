package TUBES_WG58;

// ==========================================
// E. MODUL PEMBAYARAN
// 18. PembayaranQRIS (extends Pembayaran)
// ==========================================
public class PembayaranQRIS extends Pembayaran {
    private String penyediaQRIS;
    private String kodeQR;

    public PembayaranQRIS(String idPembayaran, double totalBayar, String penyediaQRIS) {
        super(idPembayaran, totalBayar);
        this.penyediaQRIS = penyediaQRIS;
        this.kodeQR = "";
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("[QRIS] Memproses pembayaran via " + penyediaQRIS + " untuk tagihan: Rp" + totalBayar);
    }

    public void buatKodeQR() {
        this.kodeQR = "QR-" + System.currentTimeMillis();
        System.out.println("[QRIS] Kode QR berhasil di-generate: " + this.kodeQR);
    }

    // Getter & Setter (Encapsulation)
    public String getPenyediaQRIS() { return penyediaQRIS; }
    public void setPenyediaQRIS(String penyediaQRIS) { this.penyediaQRIS = penyediaQRIS; }
    public String getKodeQR() { return kodeQR; }
    public void setKodeQR(String kodeQR) { this.kodeQR = kodeQR; }
}
