/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author archil
 */
public class Supplier {

    private String supplyName;
    private int PatientID;
    private String PersonName;
    private String PersonEmail;
    private String PersonPhone;
    private String PersonAge;
    private String PersonInsurance;
    private String PersonGender;
    private String City;

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getPersonGender() {
        return PersonGender;
    }

    public void setPersonGender(String PersonGender) {
        this.PersonGender = PersonGender;
    }
    private ProductCatalog productCatalog;
    
    public Supplier() {
        productCatalog = new ProductCatalog();
        count++;
        PatientID = count;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    public String getPersonEmail() {
        return PersonEmail;
    }

    public void setPersonEmail(String PersonEmail) {
        this.PersonEmail = PersonEmail;
    }

    public String getPersonPhone() {
        return PersonPhone;
    }

    public void setPersonPhone(String PersonPhone) {
        this.PersonPhone = PersonPhone;
    }

    public String getPersonAge() {
        return PersonAge;
    }

    public void setPersonAge(String PersonAge) {
        this.PersonAge = PersonAge;
    }

    public String getPersonInsurance() {
        return PersonInsurance;
    }

    public void setPersonInsurance(String PersonInsurance) {
        this.PersonInsurance = PersonInsurance;
    }
    
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Supplier.count = count;
    }
    private static int count = 0;
    
    @Override
    public String toString() {
        return PersonName; 
    }
    
    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }
    
}
