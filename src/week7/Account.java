/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author hi
 */
public abstract class Account {
    private String number,name;
    private int balance;

    public Account(String number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    
    
    public String toString() {
        String acc="Nomor rekening: "+ number+"\n";
        acc+="Pemilik Akun: "+name+"\n";
        acc+="Saldo: "+balance;
        return acc;
    }
    
    public abstract void openAccount();
}
