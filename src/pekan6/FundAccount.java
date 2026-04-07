/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan6;

/**
 *
 * @author hi
 */
public class FundAccount extends Account{
    
    private double earningRate;

    public double getEarningRate() {
        return earningRate;
    }

    public void setEarningRate(double earningRate) {
        this.earningRate = earningRate;
    }
    
    public void earnMoney(){
        System.out.println("Keuntungan telah diperoleh");
    }
}
