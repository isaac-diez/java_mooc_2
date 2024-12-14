
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();

        String input = "";

        System.out.println("Input numbers or 00000 to stop");

        while (true) {

            input = scanner.nextLine();

            if (input.equals("00000")) {
                break;
            }

            numbers.add(input);

        }

        ArrayList<Integer> numbersReally = numbers.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayList::new));

        List<Integer> positiveNumbers = positive(numbersReally);

        positiveNumbers.stream()
                .forEach(value -> System.out.println(value));

    }

    public static List<Integer> positive(List<Integer> numbers) {

        List<Integer> positives = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return positives;

    }

}
