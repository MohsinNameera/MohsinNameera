/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author namir
 */
public class product {
     private String pName;
    private double pPrice;
   
    public product(String pName, double pPrice) {
        this.pName = pName;
        this.pPrice = pPrice;
        
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }
  
   
    
    @Override
    public String toString() {
        return this.pName;
    }
    
}
