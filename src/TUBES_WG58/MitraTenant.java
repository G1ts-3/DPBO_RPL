package TUBES_WG58;

// ==========================================
// B. MODUL PENGGUNA
// 5. MitraTenant (extends Pengguna)
// ==========================================
public class MitraTenant extends Pengguna {
    private String namaStand;
    private boolean buka;

    public MitraTenant(String idPengguna, String nama, String email, String namaStand, boolean buka) {
        super(idPengguna, nama, email);
        this.namaStand = namaStand;
        this.buka = buka;
    }

    @Override
    public void masuk() {
        System.out.println("[Login] Mitra Tenant: " + nama + " (Stand: " + namaStand + ") masuk.");
    }

    public void ubahStatusBuka() {
        this.buka = !this.buka;
        System.out.println("[Tenant] Status stand '" + namaStand + "' sekarang: " + (buka ? "BUKA" : "TUTUP"));
    }

    // Getter & Setter (Encapsulation)
    public String getNamaStand() { return namaStand; }
    public void setNamaStand(String namaStand) { this.namaStand = namaStand; }
    public boolean isBuka() { return buka; }
    public void setBuka(boolean buka) { this.buka = buka; }
}
