package lista.execercicios.MenuToDo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        List<String> listUser = new ArrayList<>();
        Scanner userIn = new Scanner(System.in);
        Boolean running = true;

        while (running) {
            System.out.println("====== Menu TO-DO ======");
            System.out.println("1 --- > Add taks");
            System.out.println("2 --- > Show all tasks");
            System.out.println("3 --- > Clear last task");
            System.out.println("4 --- > Clear all tasks");
            System.out.println("5 --- > Finish");
            System.out.print("Choose an option: ");
            int userChooseAction = userIn.nextInt();
            userIn.nextLine();
            switch (userChooseAction) {
                case 1:  // Add task
                    System.out.print("Type your Task: ");
                    String userListAddition = userIn.nextLine();
                    listUser.add(userListAddition);
                    break;
                case 2:  // List tasks
                    System.out.println("Showing tasks...");
                    if (listUser.isEmpty()){
                        System.out.println(" ");
                        System.out.println("The list is empty");
                        System.out.println(" ");
                    }else {
                        for (String tasks : listUser) {
                            System.out.println(" ");
                            System.out.println("* " + tasks);
                            System.out.println(" ");
                        }
                    }
                    break;
                case 3:  // Remove Task
                    System.out.println(" ");
                    System.out.println("Removing task");
                    System.out.println(" ");
                    listUser.removeLast();
                    break;
                case 4:  // Remove all Tasks
                    System.out.println(" ");
                    System.out.println("Removing all tasks");
                    System.out.println(" ");
                    listUser.clear();
                    break;
                case 5:  // Finish
                    System.out.println(" ");
                    System.out.println("Finishing...");
                    System.out.println(" ");
                    running = false;
                    break;
            }
        }
    }
}
