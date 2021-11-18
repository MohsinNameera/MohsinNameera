/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author namir
 */
public class menu {
     ArrayList<product> productList = new ArrayList<product>();

    public ArrayList<product> getproductList() {
        return productList;
    }

    public void setproductList(ArrayList<product> productList) {
        this.productList = productList;
    }
    
    public void addProduct(product product){
        productList.add(product);
    }
    
    public void removeProduct(product product){
        productList.remove(product);
    }
    
}
