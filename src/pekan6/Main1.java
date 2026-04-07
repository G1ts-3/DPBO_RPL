/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan6;

/**
 *
 * @author hi
 */
public class Main1 {
    public static void main(String[] args) {
        FundAccount fA = new FundAccount();
        
        // Relasi antar class
        // - Asosiasi (Garis tegak lurus) --> Saling berbagi
        // - Agregasi (Hollow diamond) --> Class 1 Kepemilikan dari Class 2, namun bisa berdiri sendiri
        // - Komposisi (Black Diamod) --> Class 1 Kepemilikan dari Class 2, namun tidak bisa berdiri sendiri
        
        fA.setNumber("111-2222");
        fA.setName("Hong Gil-dong");
        fA.setBalance(5000000);
        fA.setEarningRate(4.7);
        
        fA.openAccount();
        System.out.println("Nomor rekening : "+ fA.getNumber());
        System.out.println("Nama pemilik   : "+ fA.getName());
        System.out.println("Tabungan       : Rp. "+ fA.getBalance()+ " won");
        System.out.println("Keuntungan     : "+ fA.getEarningRate());
        fA.earnMoney();
    }
}
