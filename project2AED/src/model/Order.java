/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Product;
import java.util.ArrayList;

/**
 *
 * @author namir
 */
public class Order {
    ArrayList<OrderItem>  orderitemlist;
    
    public Order(){
        this.orderitemlist = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderitemlist() {
        return orderitemlist;
    }

    public void setOrderitemlist(ArrayList<OrderItem> orderitem) {
        this.orderitemlist = orderitemlist;
    }
 public void addNewItem(Product product, int sprice, String avail, int Yearmfg, int Seats){
     OrderItem  orderItem = new OrderItem(product,sprice,avail,Yearmfg, Seats);
     orderitemlist.add(orderItem);
 }  
 }  

