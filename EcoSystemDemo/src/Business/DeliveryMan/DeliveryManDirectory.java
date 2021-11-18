/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    ArrayList<DeliveryMan> DeliveryManList = new ArrayList<DeliveryMan>();

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return DeliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> DeliveryManList) {
        this.DeliveryManList = DeliveryManList;
    }
    
    public void addDeliveryMan(DeliveryMan deliveryMan){
        DeliveryManList.add(deliveryMan);
    }
    public void removeDeliveryMan(DeliveryMan deliveryMan){
        DeliveryManList.remove(deliveryMan);
    }
    
}
