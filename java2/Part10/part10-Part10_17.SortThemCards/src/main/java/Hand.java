/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author CBN
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for (Card item : this.hand) {
            System.out.println(item);
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public int getValueHand() {
        int value = 0;
        for (Card item : this.hand) {
            value += item.getValue();
        }
        return value;
    }
    
    @Override
    public int compareTo(Hand comparable) {
        return this.getValueHand() - comparable.getValueHand();
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
            
}
