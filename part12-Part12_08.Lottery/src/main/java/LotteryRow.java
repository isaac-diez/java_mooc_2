
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful

        Random randomNumber = new Random();

        while (this.numbers.size() <= 6) {

            int drawnNumber = randomNumber.nextInt(40) + 1;

            if (!containsNumber(drawnNumber)) {

                this.numbers.add(drawnNumber);

            }

        }

    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers

        for (int i = 0; i < this.numbers.size(); i++) {

            if (number == this.numbers.get(i)) {
                return true;
            }

        }

        return false;
    }
}
