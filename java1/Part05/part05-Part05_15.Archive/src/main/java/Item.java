/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class Item {
    private String name;
    private String id;

    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!(obj instanceof Item)) {
            return false;
        }
        
        Item comparable = (Item) obj;
        
        if((this.id.equals(comparable.id) &&
                this.name.equals(comparable.name)) ||
                (this.id.equals(comparable.id))) {
            return true;
        }
        
        return false;
    }
    
    
    
    
}
