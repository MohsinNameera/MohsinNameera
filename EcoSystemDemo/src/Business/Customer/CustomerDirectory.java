/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {ArrayList<Customer> CustomerList = new ArrayList<Customer>();

    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }

    public void setCustomerList(ArrayList<Customer> CustomerList) {
        this.CustomerList = CustomerList;
    }
    public void addCustomer(Customer customer){
        CustomerList.add(customer);
    }
    public void removeCustomer(Customer customer){
        CustomerList.remove(customer);
    }
    
}
