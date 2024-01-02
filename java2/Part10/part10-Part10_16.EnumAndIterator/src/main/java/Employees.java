/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author CBN
 */
public class Employees {
    private List<Person> employees;

    public Employees() {
        employees = new ArrayList<Person>();
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        this.employees.addAll(peopleToAdd);
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
    }
    
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person employee = iterator.next();
            if (employee.getEducation() == education) {
                System.out.println(employee);
            }
        }
        
        /*
        this.employees.stream()
                .filter(person -> person.getEducation().equals(education))
                .forEach(person -> System.out.println(person));
        */
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()){
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
    
    
}
