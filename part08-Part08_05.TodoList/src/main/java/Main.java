
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();

        UserInterface UI = new UserInterface(list, scanner);
        UI.start();

    }
}