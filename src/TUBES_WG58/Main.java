package TUBES_WG58;

import java.util.Date;

// ==========================================
// CLASS UTAMA - DEMONSTRASI SEMUA MODUL
// E-Food Court Warung Gunung 58
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   SISTEM E-FOOD COURT WARUNG GUNUNG 58      ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // ====================================
        // 1. MODUL DATABASE (Abstraction & Overriding)
        // ====================================
        System.out.println("\n--- [A] Menguji Modul Database ---");
        ManajerDatabase db = new KonektorMySQL("localhost", "3306", "db_wg58");
        db.hubungkan();
        db.eksekusiQuery("SELECT * FROM tb_produk");

        // ====================================
        // 2. MODUL PENGGUNA (Polymorphism)
        // ====================================
        System.out.println("\n--- [B] Menguji Modul Pengguna (Polymorphism) ---");

        Pengguna pelanggan = new Pelanggan("U001", "Budi Santoso", "budi@mail.com", 100);
        Pengguna tenant   = new MitraTenant("T001", "Bu Sri", "sri@mail.com", "Ayam Geprek Sri", false);
        Pengguna admin    = new Admin("A001", "Pak Rudi", "rudi@admin.com", 3);

        // Polymorphism: method masuk() dipanggil sesuai tipe objek sebenarnya
        pelanggan.masuk();
        tenant.masuk();
        admin.masuk();

        // Akses method spesifik child class via casting
        ((Pelanggan) pelanggan).tambahPoin(50);
        ((MitraTenant) tenant).ubahStatusBuka();
        ((Admin) admin).kelolaSistem();

        // ====================================
        // 3. MODUL PRODUK (Polymorphism)
        // ====================================
        System.out.println("\n--- [C] Menguji Modul Produk ---");

        Produk nasgor = new Makanan("P001", "Nasi Goreng Spesial", 25000, true);
        Produk esTeh  = new Minuman("P002", "Es Teh Manis", 5000, true);
        Produk jus    = new Minuman("P003", "Jus Alpukat", 12000, true);

        // Polymorphism: ambilDetail() sesuai tipe objek
        nasgor.ambilDetail();
        esTeh.ambilDetail();
        jus.ambilDetail();

        // Paket Bundling
        System.out.println();
        PaketBundling paket = new PaketBundling("P004", "Paket Hemat Kenyang", 28000, 2000);
        paket.tambahMenu(nasgor);
        paket.tambahMenu(esTeh);
        paket.ambilDetail();

        // ====================================
        // 4. MODUL PESANAN (Overloading & Overriding)
        // ====================================
        System.out.println("\n--- [D] Menguji Modul Pesanan ---");

        // Pesanan Makan di Tempat
        System.out.println(">> Pesanan Makan di Tempat:");
        Pesanan dineIn = new PesananMakanDiTempat("ORD-001", new Date(), "Proses", 2000);
        dineIn.tambahMenu(nasgor);          // Overloading: 1 parameter
        dineIn.tambahMenu(esTeh, 3);        // Overloading: 2 parameter
        double totalDineIn = dineIn.hitungTotal();

        // Pesanan Bawa Pulang
        System.out.println("\n>> Pesanan Bawa Pulang:");
        Pesanan takeAway = new PesananBawaPulang("ORD-002", new Date(), "Proses", 3000);
        takeAway.tambahMenu(nasgor, 2);     // Overloading: 2 parameter
        takeAway.tambahMenu(jus);           // Overloading: 1 parameter
        double totalTakeAway = takeAway.hitungTotal();

        // Meja
        System.out.println();
        Meja meja5 = new Meja(5, true);
        meja5.aturKetersediaan(false);

        // ====================================
        // 5. MODUL PEMBAYARAN (Polymorphism)
        // ====================================
        System.out.println("\n--- [E] Menguji Modul Pembayaran ---");

        // Bayar Tunai untuk pesanan Dine-In
        System.out.println(">> Pembayaran Tunai:");
        PembayaranTunai tunai = new PembayaranTunai("PAY-001", totalDineIn, 50000);
        tunai.prosesPembayaran();
        tunai.hitungKembalian();

        // Bayar QRIS untuk pesanan Take-Away
        System.out.println("\n>> Pembayaran QRIS:");
        PembayaranQRIS qris = new PembayaranQRIS("PAY-002", totalTakeAway, "GoPay");
        qris.buatKodeQR();
        qris.prosesPembayaran();

        // Polymorphism pada Pembayaran
        System.out.println("\n>> Demonstrasi Polymorphism Pembayaran:");
        Pembayaran[] daftarBayar = { tunai, qris };
        for (Pembayaran p : daftarBayar) {
            p.prosesPembayaran();
        }

        // ====================================
        // PENUTUP
        // ====================================
        System.out.println();
        db.putuskan();
        pelanggan.keluar();

        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║          PROGRAM SELESAI DIJALANKAN          ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }
}
