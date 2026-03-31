/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan5;

/**
 *
 * @author hi
 */
public class Rekening {
    private String nomorRekening,namaPemilik;
    private double saldo;
    
    public Rekening(String nomorRekening, String namaPemilik, double saldo){
        this.nomorRekening=nomorRekening;
        this.namaPemilik=namaPemilik;
        this.saldo=saldo;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void deposit(double cash){
        saldo += cash;
    }
    
    public void withdraw(double cash){
        saldo -= cash;
    }
    
}
