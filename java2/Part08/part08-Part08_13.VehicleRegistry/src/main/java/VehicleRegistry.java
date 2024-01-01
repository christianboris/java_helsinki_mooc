/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author CBN
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    
    
    public VehicleRegistry() {
        this.registry = new HashMap();
    }
    
    
    
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate) && (!(this.registry.get(licensePlate) == null))) {
            return false;
        } else {
            this.registry.put(licensePlate, owner);
            return true;
        }
        
    }
    
    public String get(LicensePlate licensePlate){
        return this.registry.get(licensePlate);
        
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        } else {
            return false;
        }
        
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<String>();
        for (String owner : this.registry.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
            
        }        
    }
}
