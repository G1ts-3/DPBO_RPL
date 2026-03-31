/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan5;

/**
 *
 * @author hi
 */
public class Buku {
    private String judul, pengarang;
    private double harga;
    
    public Buku(String judul, String pengarang, double harga){
        this.judul=judul;
        this.pengarang=pengarang;
        this.harga=harga;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public double getHarga() {
        return harga;
    }
    
    
}
