/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 *
 * @author namir
 */
public class orderWorkRequest extends WorkRequest {
    private String ID;
    
    private List<productWithQty> productssWithQtyList = new ArrayList<productWithQty>();
    
    private String FeedbackbyCustomer;
    public orderWorkRequest() {
        UUID uuid = UUID.randomUUID();
        ID = uuid.toString();
    }

    public String getID() {
        return ID;
    }
     public productWithQty addItem(productWithQty productWithQty){
        productssWithQtyList.add(productWithQty);
        return productWithQty;
    }


    public List<productWithQty> getProductssWithQtyList() {
        return productssWithQtyList;
    }

    public void setProductssWithQtyList(List<productWithQty> productssWithQtyList) {
        this.productssWithQtyList = productssWithQtyList;
    }


    public String getFeedbackbyCustomer() {
        return FeedbackbyCustomer;
    }

    public void setFeedbackbyCustomer(String FeedbackbyCustomer) {
        this.FeedbackbyCustomer = FeedbackbyCustomer;
    }
    
    
}
