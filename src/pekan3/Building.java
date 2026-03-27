/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan3;

/**
 *
 * @author hi
 */
public class Building {
    private static String alamat;
    private static String nama;
    private int ukuran;
    
    //digunakan untuk memanggil/mengakses data
    public static String getNama(){
        return nama;
    }
    //digunakan unntuk mengubah data
    public void setNama(String nama){
        this.nama=nama;
    }
}
