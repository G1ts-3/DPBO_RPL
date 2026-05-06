package TUBES_WG58;

import java.util.Date;

// ==========================================
// D. MODUL PESANAN
// 12. PesananMakanDiTempat (extends Pesanan)
// ==========================================
public class PesananMakanDiTempat extends Pesanan {
    private double pajakLayanan;

    public PesananMakanDiTempat(String idPesanan, Date tanggal, String status, double pajakLayanan) {
        super(idPesanan, tanggal, status);
        this.pajakLayanan = pajakLayanan;
    }

    @Override
    public double hitungTotal() {
        double total = 0;
        for (ItemPesanan item : daftarItem) {
            total += item.ambilSubTotal();
        }
        total += pajakLayanan;
        System.out.println("[Billing] Total Makan di Tempat (termasuk pajak layanan Rp" + pajakLayanan + "): Rp" + total);
        return total;
    }

    // Getter & Setter (Encapsulation)
    public double getPajakLayanan() { return pajakLayanan; }
    public void setPajakLayanan(double pajakLayanan) { this.pajakLayanan = pajakLayanan; }
}
