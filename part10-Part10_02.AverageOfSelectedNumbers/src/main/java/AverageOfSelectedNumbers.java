
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String input = "";
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {

            input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            list.add(input);

        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String operation = scanner.nextLine();

        if (operation.equals("p")) {
            
            double averageOfPositiveNumbers = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + averageOfPositiveNumbers);

        } else if (operation.equals("n")) {

            double averageOfNegativeNumbers = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + averageOfNegativeNumbers);
        } 

    }
}
