package TUBES_WG58;

// ==========================================
// B. MODUL PENGGUNA
// 3. Pengguna (Abstract Class)
// ==========================================
public abstract class Pengguna {
    protected String idPengguna;
    protected String nama;
    protected String email;

    public Pengguna(String idPengguna, String nama, String email) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.email = email;
    }

    // Method Abstract
    public abstract void masuk();

    // Method Concrete
    public void keluar() {
        System.out.println("[Sistem] Pengguna " + nama + " berhasil keluar.");
    }

    // Getter & Setter (Encapsulation)
    public String getIdPengguna() { return idPengguna; }
    public void setIdPengguna(String idPengguna) { this.idPengguna = idPengguna; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
