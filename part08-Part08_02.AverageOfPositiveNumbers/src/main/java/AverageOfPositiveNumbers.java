
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        int number = 1;
        double count = 0;
        
        while (number!=0) {
            
            number = Integer.valueOf(scanner.nextLine());
            
            if (number > 0){
                
                numbers.add(number);
                count++;
                
            }
            
        }
        
        if (numbers.isEmpty()) {
            
            System.out.println("Cannot calculate the average");
            
        } else {
            double sum = 0;
            for (int i=0; i<numbers.size(); i++) {
                
                sum += numbers.get(i);
                
            }
            
            double average = (sum / count);
            System.out.println(average);
            
        }
        

    }
}
