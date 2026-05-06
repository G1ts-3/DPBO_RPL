package TUBES_WG58;

// ==========================================
// D. MODUL PESANAN
// 14. ItemPesanan
// ==========================================
public class ItemPesanan {
    private int jumlah;
    private double subTotal;

    public ItemPesanan(int jumlah, double subTotal) {
        this.jumlah = jumlah;
        this.subTotal = subTotal;
    }

    public double ambilSubTotal() {
        System.out.println("       Item (" + jumlah + " pcs) - SubTotal: Rp" + subTotal);
        return this.subTotal;
    }

    // Getter & Setter (Encapsulation)
    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
    public double getSubTotal() { return subTotal; }
    public void setSubTotal(double subTotal) { this.subTotal = subTotal; }
}
