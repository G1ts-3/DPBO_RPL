/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan3;

/**
 *
 * @author hi
 */
public class Employee {
    //ada 5 atribut atau property
    String id,nama,unit;
    int gaji,durasi;
    
    //Konstruktor
    Employee(){
        //tanpa parameter
    }
    
    //Konstruktor Overloading ==> adanya lebih dari 1 konstruktor dgn nama yg sama tpi param yg berbeda
    //overloading ==> adanya lebih dari 1 method dgn nama yg sama tpi param berbeda
    
    Employee(String id,String nama,String unit, int gaji, int durasi){
        //dengan parameter
        this.id=id;
        this.nama=nama;
        this.unit=unit;
        this.gaji=gaji;
        this.durasi=durasi;
    }
    
    // Dalam Class Diagram
    // - => private
    // + => Public
    // # => Protected
    
    //Getter-Setter
    //Getter mengakses data dari atribut
    //Setter mengubah data dari atribut
    
    //method Overloading
    void printData(String id, String nama){
        System.out.println("Id : "+id+" \nNama : "+nama);
    }
    void printData(int gaji, int durasi){
        System.out.println("Gaji : "+gaji+" \nDurasi : "+durasi);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    
}
