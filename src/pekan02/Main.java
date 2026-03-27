/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan02;

/**
 *
 * @author hi
 */
public class Main {

    public static void main(String[] args) {
        // instansiasi dari class Mahasiswa
        Student s = new Student();

        //konstruktor = alat pembuat objek
        //instance = hasil
        s.id = "001";
        s.nama = "Budi";
        s.bkorea = 100;
        s.bingg = 100;
        s.mtk = 100;

        s.info();
        s.ubahID("STU0001");
        System.out.println("\n----- perubahan -----\n");
        s.info();
    }
}
