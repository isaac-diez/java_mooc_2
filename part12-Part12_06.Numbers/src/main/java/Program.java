
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        
        int input = Integer.valueOf(scanner.nextLine());
        
        Random randomNumber = new Random();
        
        for (int i = 0; i < input; i++) {
            
            double newRandomNumber = randomNumber.nextDouble();
            System.out.println(newRandomNumber);
            
        }
        
    }

}
