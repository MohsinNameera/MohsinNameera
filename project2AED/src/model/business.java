/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author namir
 */
public class business {
    MOL mol;
    SupplierDirectory supplierDirectory;
    
    public business(){
        mol = new MOL();
        supplierDirectory = new SupplierDirectory();
        
    }

    public MOL getMol() {
        return mol;
    }

    public void setMol(MOL mol) {
        this.mol = mol;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
}
