
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public class UserInterface {

    private Scanner sc;
    private TodoList list;

    public UserInterface(TodoList list, Scanner sc) {

        this.sc = sc;
        this.list = list;

    }

    public void start() {

        while (true) {

            System.out.println("Command:");
            String command = this.sc.nextLine();

            if (command.equals("add")) {
                System.out.println("To add:");
                String task = this.sc.nextLine();
                this.list.add(task);
                continue;
            }

            if (command.equals("list")) {
                this.list.print();
                continue;

            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int taskRemove = Integer.valueOf(sc.nextLine());
                this.list.remove(taskRemove);
                continue;
            }

            if (command.equals("stop")) {
                break;
            }

        }

    }
}