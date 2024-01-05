/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class Hideout<T> {
    
    private T item;

    public Hideout() {
    }
    
    public void putIntoHideout (T toHide){
        this.item = toHide;
    }
    
    public T takeFromHideout(){
        T itemTemp = this.item;
        this.item = null;
        return itemTemp;
    }
    
    public boolean isInHideout(){
        return item.equals(null);
    }
}
