/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_01;

/**
 *
 * @author hi
 */
public class Kucing extends Hewan{
    private String nama;
    
    // jika method abstract, kucing wajib memiliki method
    // yg sama seperti Hewan, kalau tidak maka akan error.
    @Override
    public void bersuara(){
        // jika method kosong, itu tidak masalah karna sudah memiliki method dari abstract class
    }

    @Override
    public void berlari() {
        // abstract method bisa di insert code dengan implement method
    }
}
