/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Restaurant.product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namir
 */
public class productWithQty {
    
    product product;
    
    int qty;
    public productWithQty(product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public product getProduct() {
        return product;
    }

    public void setProduct(product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
       if(product != null){
            return product.getpName();
      }else{
        return "Error in Name";  
        } 
    }
  
    
}
