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

        //Users database
        ArrayList<Expense> expenseList = new ArrayList<>();

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

                    //ask expense name, amount, user

                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                    expense.expenseName = scanner.next();

                    System.out.println("Expense amount: ");
                    expense.amount = scanner.nextInt();

                    System.out.println("Which user made this expense? Type user ID: ");
                    for (User user : userList) {
                        System.out.println("ID: " + userList.indexOf(user) + " Name: " + user.name);
                    }


                    int userId = scanner.nextInt();

                    User user = userList.get(userId);

                    expense.user = user.name;


                    expenseList.add(expense);

                    break;

                case 1:

                    System.out.println("Please provide user name that you would like to search");
                    String userName = scanner.next();

                    User myUser = null;
                    for (User chosenUser : userList) {
                        if(chosenUser.name.equals(userName)){
                            myUser = chosenUser;
                            break;
                        }
                    }

                    if(myUser == null){
                        System.out.println("User doesn't exists!");
                        break;
                    }

                    //List specific person expense

                    int userExpenseAmount = 0;
                    int expenseCount = 0;

                    for (int i = 0; i < expenseList.size(); i++) {

                        if(expenseList.get(i).user.equals(userName)){

                            userExpenseAmount += expenseList.get(i).amount;
                            expenseCount++;

                            System.out.println(expenseCount + " - expense amount: " + expenseList.get(i).amount + ", expense by :" + expenseList.get(i).user);
                        }

                    }

                    System.out.println(myUser.name + " spent $ " + userExpenseAmount);

                    break;

                case 2:
                    for (int i = 0; i < expenseList.size(); i++) {
                        System.out.println( i + " - expense amount : " + expenseList.get(i).amount + ", expense by: " + expenseList.get(i).user);
                    }
                    break;

                case 3:

                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    double totalAmount = 0;

                    for (Split split : splitList) {
                        totalAmount += split.amount;
                    }

                    makeSplit(totalAmount,splitList);


                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }

        }

    }

    public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

        double amount = totalAmount / splitList.size();

        for (Split split : splitList) {
            if(split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.userName + " needs to give " + (amount - split.amount));
            }

        }

    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for (Expense expense : expenseList) {

            Split split = existSplitList(expense.user, splitList);

            if(split != null){
                split.amount += expense.amount;
            }else{
                Split willBeAdded = new Split();
                willBeAdded.userName = expense.user;
                willBeAdded.amount = expense.amount;
                splitList.add(willBeAdded);
            }

        }

        return splitList;
    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {

        for (Split split : splitList) {
            if(split.userName.equals(userName)){
                return split;
            }
        }

        return null;
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


