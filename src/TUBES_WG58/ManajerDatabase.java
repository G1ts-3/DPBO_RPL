package TUBES_WG58;

// ==========================================
// A. MODUL DATABASE
// 1. ManajerDatabase (Abstract Class)
// ==========================================
public abstract class ManajerDatabase {
    protected String host;
    protected String port;
    protected String namaDB;

    public ManajerDatabase(String host, String port, String namaDB) {
        this.host = host;
        this.port = port;
        this.namaDB = namaDB;
    }

    // Method Abstract
    public abstract void hubungkan();
    public abstract void putuskan();

    // Method Concrete
    public void eksekusiQuery(String q) {
        System.out.println("[Database] Mengeksekusi query: " + q);
    }

    // Getter & Setter (Encapsulation)
    public String getHost() { return host; }
    public void setHost(String host) { this.host = host; }
    public String getPort() { return port; }
    public void setPort(String port) { this.port = port; }
    public String getNamaDB() { return namaDB; }
    public void setNamaDB(String namaDB) { this.namaDB = namaDB; }
}
