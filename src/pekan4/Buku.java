/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan4;

/**
 *
 * @author hi
 */
public class Buku {
    private String judul,pengarang;
    private int harga;

    
    Buku(String judul,String pengarang,int harga){
        this.judul=judul;
        this.pengarang=pengarang;
        this.harga=harga;
    }
    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getHarga() {
        return harga;
    }
    
    
}
