
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {

        this.hand = new ArrayList<>();

    }

    public void add(Card card) {
        //adds a card to the hand
        this.hand.add(card);
    }

    public void print() {
        //prints the cards in hand
        this.hand.stream().
                forEach(card -> {
                    System.out.println(card);
                });
    }

    public void sort() {

        Collections.sort(hand);

    }

    @Override
    public int compareTo(Hand hand2) {

//        Iterator<Card> iterator = this.hand.iterator();
//        while (iterator.hasNext()) {
//            (iterator.next());
//        }
        int thisValue = this.hand.stream()           //these get the sums
                .map( card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        int otherValue = hand2.hand.stream()
                .map( card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        
        return thisValue - otherValue;
    }


    public void sortBySuit() {

        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
        Collections.sort(this.hand, sortBySuitSorter);

    }

}
