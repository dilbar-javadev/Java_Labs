package lab08_SplitterApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Budget Planner!");


        //Ask how many people in the budget planner?
        System.out.println("How many people will split the budget?");


        // Creat user

        ArrayList<User> userList = prepareUserLists(scanner);


    }

    public static ArrayList<User> prepareUserLists(Scanner scanner) {

        ArrayList<User> userList = new ArrayList<>();

        int userCount = scanner.nextInt();

        for (int i = 0; i < userCount; i++) {

            User user = new User();

            System.out.println("Name: ");
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();

            userList.add(user);   //object
        }

        return userList;
    }

}


