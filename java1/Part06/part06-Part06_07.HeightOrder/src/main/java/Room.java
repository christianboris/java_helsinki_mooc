/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author CBN
 */
public class Room {
    private ArrayList<Person> room;

    public Room() {
        room = new ArrayList();
    }
    
    public void add(Person person) {
        room.add(person);
    }
    
    public boolean isEmpty() {
        return room.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.room;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = room.get(0);
        
        for (Person person : room) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        this.room.remove(shortest);
        return shortest;
    }
    
    
    
    
    
    
}
