package TUBES_WG58;

import java.util.Date;

// ==========================================
// D. MODUL PESANAN
// 13. PesananBawaPulang (extends Pesanan)
// ==========================================
public class PesananBawaPulang extends Pesanan {
    private double biayaBungkus;

    public PesananBawaPulang(String idPesanan, Date tanggal, String status, double biayaBungkus) {
        super(idPesanan, tanggal, status);
        this.biayaBungkus = biayaBungkus;
    }

    @Override
    public double hitungTotal() {
        double total = 0;
        for (ItemPesanan item : daftarItem) {
            total += item.ambilSubTotal();
        }
        total += biayaBungkus;
        System.out.println("[Billing] Total Bawa Pulang (termasuk biaya bungkus Rp" + biayaBungkus + "): Rp" + total);
        return total;
    }

    // Getter & Setter (Encapsulation)
    public double getBiayaBungkus() { return biayaBungkus; }
    public void setBiayaBungkus(double biayaBungkus) { this.biayaBungkus = biayaBungkus; }
}
