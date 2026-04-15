/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author hi
 */
public class FundAccount extends Account{
    private double earningRate;

    public FundAccount( String number, String name, int balance,double earningRate) {
        super(number, name, balance);
        this.earningRate = earningRate;
    }

    public void earnMoney(){
        System.out.println("Keuntungan diperoleh");
    }
    @Override
    public String toString() {
        return super.toString()+"\nTingkat pengembalian: "+earningRate; 
    }

    @Override
    public void openAccount() {
        System.out.println("Buka Akun");
    }
    
    
    
    
}
