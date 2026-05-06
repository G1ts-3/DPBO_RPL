/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

/**
 *
 * @author hi
 */
public class Car implements Washer{
    private int oilSize;
    
    public void go(int distance){
        System.out.println("");
    }

    public int getOilSize() {
        return oilSize;
    }

    public void setOilSize(int oilSize) {
        this.oilSize = oilSize;
    }

    @Override
    public void wash() {
        System.out.println("Mencuci Mobil");
    }
    
    
}
