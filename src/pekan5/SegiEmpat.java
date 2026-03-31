/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan5;

/**
 *
 * @author hi
 */
public class SegiEmpat {
    private int panjang,lebar;
    
    public SegiEmpat(int panjang, int lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public SegiEmpat(int panjang){
        this.panjang=panjang;
        lebar=0;
    }
    public int getLuas(){
        if(lebar==0){
            return panjang*panjang;
        }else{
            return panjang*lebar;
        }
    }
    public int getKeliling(){
        if(lebar==0){
            return 4*panjang;
        }else{
            return 2 * (panjang +lebar);
        }
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
    
}
