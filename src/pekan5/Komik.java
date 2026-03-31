/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan5;

/**
 *
 * @author hi
 */
public class Komik {
    private String judul,penulis;
    private double harga;
    private int tamat;
    
    public Komik(String judul, String penulis, double harga, int tamat){
        this.judul=judul;
        this.penulis=penulis;
        this.harga=harga;
        this.tamat=tamat;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setTamat(int tamat) {
        this.tamat = tamat;
    } 
    
    public void displayData(){
        System.out.println("Judul   : "+judul);
        System.out.println("Penulis : "+penulis);
        System.out.println("Harga   : "+harga);
        System.out.println("Tamat   : "+tamat);
    }
    
}
