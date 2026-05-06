package TUBES_WG58;

// ==========================================
// A. MODUL DATABASE
// 2. KonektorMySQL (extends ManajerDatabase)
// ==========================================
public class KonektorMySQL extends ManajerDatabase {
    private boolean statusKoneksi;

    public KonektorMySQL(String host, String port, String namaDB) {
        super(host, port, namaDB);
        this.statusKoneksi = false;
    }

    @Override
    public void hubungkan() {
        this.statusKoneksi = true;
        System.out.println("[MySQL] Berhasil terhubung ke " + host + ":" + port + "/" + namaDB);
    }

    @Override
    public void putuskan() {
        this.statusKoneksi = false;
        System.out.println("[MySQL] Koneksi ke database diputus.");
    }

    // Getter & Setter (Encapsulation)
    public boolean isStatusKoneksi() { return statusKoneksi; }
    public void setStatusKoneksi(boolean statusKoneksi) { this.statusKoneksi = statusKoneksi; }
}
