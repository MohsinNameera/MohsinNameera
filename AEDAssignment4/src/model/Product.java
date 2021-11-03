/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.*;

/**
 *
 * @author archil
 */
public class Product {
    private String encounterType;
    private int EncounterID;
    private int BPUpper;
    private int BPLower;
    private String Results;
    private Date EncounterDate;
    
     public String getResults() {
        return Results;
    }

    public void setResults(String Results) {
        this.Results = Results;
    }
    public String getEncounterType() {
        return encounterType;
    }

    public void setEncounterType(String encounterType) {
        this.encounterType = encounterType;
    }


    public int getEncounterID() {
        return EncounterID;
    }

    public void setEncounterID(int EncounterID) {
        this.EncounterID = EncounterID;
    }

    public int getBPUpper() {
        return BPUpper;
    }

    public void setBPUpper(int BPUpper) {
        this.BPUpper = BPUpper;
    }

    public int getBPLower() {
        return BPLower;
    }

    public void setBPLower(int BPLower) {
        this.BPLower = BPLower;
    }

   
     private static int count = 0;
    @Override
    public String toString() {
        return encounterType; 
    }
     public Product() {
        count++;
        EncounterID = count;
    }
      public Date getEncounterDate() {
        return EncounterDate;
    }

    public void setEncounterDate(Date EncounterDate) {
        this.EncounterDate = EncounterDate;
    }
    
       


   /* @Override
    public String toString() {
        return patientName; //To change body of generated methods, choose Tools | Templates.
    }*/

   

}
