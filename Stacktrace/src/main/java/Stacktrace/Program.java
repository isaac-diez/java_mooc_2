/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacktrace;

import java.util.ArrayList;
import java.util.List;
class Statistics {
    
    private List<Integer> numbers;
    
    public Statistics() {
        this.numbers = new ArrayList();
    }
    
    public void add(int number) {
        this.numbers.add(number);
    }
    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}

public class Program{
    public static void main(String[] args) {
        Statistics st = new Statistics();
        System.out.println("Printing the average of the statistics: " + st.average());
        System.out.println("Adding number 22");
        st.add(22);
        st.add(24);
        System.out.println("Printing the average of the statistics: " + st.average());
    }
}
