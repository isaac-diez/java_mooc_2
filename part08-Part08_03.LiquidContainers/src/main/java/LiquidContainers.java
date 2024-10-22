
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = "";
        int amount = 0;

        int cont1 = 0;
        int cont2 = 0;

        while (!command.equals("quit")) {

            System.out.println("First: " + cont1 + "/100\nSecond: " + cont2 + "/100");

            command = scan.nextLine();

            if (command.contains(" ")) {
                String[] parts = command.split(" ");
                command = parts[0];
                amount = Integer.valueOf(parts[1]);

            }

            if ((command.equals("add") && (amount > 0))) {
                cont1 = cont1 + amount;
                if (cont1 > 100) {
                    cont1 = 100;
                }
            }

            if ((command.equals("move") && (amount > 0))) {
                if (cont1 > 0) {
                    if (cont1 - amount < 0) {
                        cont2 = cont1;
                        cont1 = 0;
                    } else {
                        cont1 -= amount;
                        cont2 += amount;
                    }
                    if (cont2 > 100) {
                        cont2 = 100;
                    }
                }
            }

            if ((command.equals("remove") && (amount > 0))) {
                cont2 = cont2 - amount;
                if (cont2 < 0) {
                    cont2 = 0;
                }

            }
        }

    }
}
