/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan4;

/**
 *
 * @author hi
 */
public class Building {
    private String alamat="Usa";
    private static String nama="gedung putih";
    private int ukuran=10;
    
    //digunakan untuk memanggil/mengakses data
    public static String getNama(){
        return nama;
    }
    //digunakan unntuk mengubah data
    public void setNama(String nama){
        this.nama=nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUkuran() {
        return ukuran;
    }
}
