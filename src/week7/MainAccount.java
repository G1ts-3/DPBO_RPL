/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author hi
 */
public class MainAccount {
    public static void main(String[] args) {
        FundAccount[] fa = {new FundAccount("0011","Kevin",10000,4),
        new FundAccount("1010","Budi",15000,5.0)};
        
        for(int i=0;i<fa.length;i++){
            fa[i].openAccount();
            System.out.println(fa[i].toString());
            fa[i].earnMoney();
            System.out.println("\n");
        }
        
    }
    // Di Class Abstrak tidak dapat membuat objek kecuali menggunakan kelas turunannnya.
    // jika ada method di Class abstrak, maka wajib ada juga di kelas turunannya.
}
