package lab08_SplitterApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Budget Planner!");


        //Ask how many people in the budget planner?
        System.out.println("How many people will split the budget?");
        int userCount = scanner.nextInt();

        // Creat user

        for(int i = 0; i < userCount; i++){

            User user = new User();

            System.out.println("Name: ");
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();


        }
    }
}
