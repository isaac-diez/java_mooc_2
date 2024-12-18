
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();
        
        while(true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0) {
                break;
            }
            
            inputList.add(input);
        }
        
        inputList.stream()
                .filter(input -> input < 6 && input > 0)
                .forEach(input -> System.out.println(input));

    }
}
