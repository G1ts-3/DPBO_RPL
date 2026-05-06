package TUBES_WG58;

// ==========================================
// B. MODUL PENGGUNA
// 4. Pelanggan (extends Pengguna)
// ==========================================
public class Pelanggan extends Pengguna {
    private int poinLoyalitas;

    public Pelanggan(String idPengguna, String nama, String email, int poinLoyalitas) {
        super(idPengguna, nama, email);
        this.poinLoyalitas = poinLoyalitas;
    }

    @Override
    public void masuk() {
        System.out.println("[Login] Pelanggan: " + nama + " masuk. Poin Anda: " + poinLoyalitas);
    }

    public void tambahPoin(int p) {
        this.poinLoyalitas += p;
        System.out.println("[Loyalitas] " + p + " poin ditambahkan untuk " + nama + ". Total poin: " + this.poinLoyalitas);
    }

    // Getter & Setter (Encapsulation)
    public int getPoinLoyalitas() { return poinLoyalitas; }
    public void setPoinLoyalitas(int poinLoyalitas) { this.poinLoyalitas = poinLoyalitas; }
}
