
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {

        this.history = new ArrayList<>();

    }

    public void add(double status) {

        history.add(status);
    }

    public void clear() {

        history.clear();
    }

    public double maxValue() {

        if (history.isEmpty()) {
            return 0; 
        }
        
        double maxValue = 0;

        for (int i = 0; i < history.size(); i++) {

            if (maxValue < history.get(i)) {
                maxValue = history.get(i);
            }
        }

        return maxValue;
    }

    public double minValue() {

        double minValue = history.get(0);

        for (int i = 1; i < history.size(); i++) {

            if (minValue > history.get(i)) {
                minValue = history.get(i);
            }
        }

        return minValue;
    }

    public double average() {

        double sum = 0;
        double average = 0;

        for (int i = 0; i < history.size(); i++) {

            sum = sum + history.get(i);
             
        }

        return average = sum/history.size() ;
    }

    public String toString() {

        return history.toString();
    }

}
