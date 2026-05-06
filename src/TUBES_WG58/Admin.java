package TUBES_WG58;

// ==========================================
// B. MODUL PENGGUNA
// 6. Admin (extends Pengguna)
// ==========================================
public class Admin extends Pengguna {
    private int tingkatAkses;

    public Admin(String idPengguna, String nama, String email, int tingkatAkses) {
        super(idPengguna, nama, email);
        this.tingkatAkses = tingkatAkses;
    }

    @Override
    public void masuk() {
        System.out.println("[Login] Admin: " + nama + " (Level Akses: " + tingkatAkses + ") masuk.");
    }

    public void kelolaSistem() {
        System.out.println("[Admin] " + nama + " sedang mengelola menu dan pengguna sistem.");
    }

    // Getter & Setter (Encapsulation)
    public int getTingkatAkses() { return tingkatAkses; }
    public void setTingkatAkses(int tingkatAkses) { this.tingkatAkses = tingkatAkses; }
}
