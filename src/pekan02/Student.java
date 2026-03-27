/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan02;

/**
 *
 * @author hi
 */
public class Student {

    String nama, id;
    int bkorea, bingg, mtk;

    int calculate() {
        return (bkorea + bingg + mtk) / 3;
    }

    void info() {
        System.out.println("Nama      : " + nama);
        System.out.println("ID        : " + id);
        System.out.println("Korea     : " + bkorea);
        System.out.println("English   : " + bingg);
        System.out.println("MTK       : " + mtk);
        System.out.println("Rata-rata : " + calculate());
    }

    void ubahID(String newId) {
        id = newId;
    }
}
