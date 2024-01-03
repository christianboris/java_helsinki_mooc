/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author CBN
 */
public class Warehouse {
    
    private Map <String, Integer> items;
    private Map <String, Integer> stock;

    public Warehouse() {
        this.items = new HashMap();
        this.stock = new HashMap();
    }
    
    public void addProduct(String product, int price, int stock){
        this.items.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        return this.items.getOrDefault(product, -99); 
    }
    
    public int stock(String product){
        return this.stock.getOrDefault(product, 0);
    }
    
    
    public boolean take(String product){
        if (this.stock.containsKey(product)) {
            int quantity = this.stock.get(product);
            if (quantity > 0) {
                this.stock.put(product, quantity - 1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        return (Set) this.stock.keySet();
    }
    
    
  
}
