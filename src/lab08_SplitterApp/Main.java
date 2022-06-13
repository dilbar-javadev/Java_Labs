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

        System.out.println("Added user count: " + userList.size());

        String[] optionList = prepareOptionList();

        while(true){

            System.out.println("What would you like to do?");

            for (int i = 0; i < optionList.length; i++) {

                System.out.println((i+1) + " : " + optionList[i]);

            }

            int request = scanner.nextInt();

            switch(request-1){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }

        }

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

    public static String[] prepareOptionList(){

         /*
        Creating options
        0 : Make Expense
        1 : List Specific person Expense
        2 : List All Expenses
        3 : Make Split
        4 : List All Users
        5 : Close the Budget
         */

        String[] optionList = {"Make Expense", "List Specific person Expense", "List All Expenses", "Make Split", "List All Users", "Close the Budget"};

        return optionList;
    }
}


