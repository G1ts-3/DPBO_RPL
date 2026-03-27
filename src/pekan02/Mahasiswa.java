/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan02;

/**
 *
 * @author hi
 */
public class Mahasiswa {
    //atribut atau property
    public String nim;
    private String nama;
    protected String kelas;
    
    
    //Konstruktor
    //Konstruktor ada tiga
    
    //akses modifier
    //public, private, protected,default
    
    Mahasiswa(){
        
    }

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    
    
    //perilaku atau behavior
    void turu(String mimpi){
        System.out.println(nama+" sedang turu, mimpiin "+mimpi);
    }
    
}
