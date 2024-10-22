
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = "";
        
        while (!input.equals("end")) {
            
            input = scanner.nextLine();
            
            if (!input.equals("end")) {
                int cube = Integer.valueOf(input);
                cube = cube*cube*cube;
            
                System.out.println(cube);
            }
            
            
            
        }

    }
}
