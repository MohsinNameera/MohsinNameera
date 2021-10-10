/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Product;
/**
 *
 * @author namir
 */
public class OrderItem {
    Product product;
    int sprice;
    String avail;
    int Yearmfg;
    int Seats;

    public int getYearmfg() {
        return Yearmfg;
    }

    public void setYearmfg(int Yearmfg) {
        this.Yearmfg = Yearmfg;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }
    
    public OrderItem(Product product, int sprice, String avail, int Yearmfg , int Seats ){
        this.product = product;
        this.sprice = sprice;
        this.avail = avail;
        this.Yearmfg = Yearmfg;
        this.Seats = Seats;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSprice() {
        return sprice;
    }

    public void setSprice(int sprice) {
        this.sprice = sprice;
    }
    
}
