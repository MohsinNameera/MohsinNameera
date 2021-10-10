/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author namir
 */
public class MOL {
    ArrayList<Order> Orderlist;
    public MOL(){
        Orderlist= new ArrayList<Order>();
        
    }

    public ArrayList<Order> getOrderlist() {
        return Orderlist;
    }

    public void setOrderL(ArrayList<Order> Orderlist) {
        this.Orderlist = Orderlist;
    }
    
}
