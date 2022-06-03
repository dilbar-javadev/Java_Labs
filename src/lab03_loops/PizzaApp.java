package lab03_loops;

import java.util.Scanner;

public class PizzaApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        makeOrder(login()); // email address

        }

    private static void makeOrder(String email) {

        for (int i = 0; i < 3;) {

            System.out.println("Which pizza would you like to have? (Please type pizza name. To creat your own pizza, please type special)");

            Scanner scanner = new Scanner(System.in);
            String pizzaChoice = scanner.next();


            // selection statements - > in the system we have 3 kinds of pizza. Salami, Marg, Meat lover, Special
            if(checkPizzaThatWeHave(pizzaChoice)){  // valid pizza

                if(pizzaChoice.equals("special")){  //special pizza

                    //build your pizza
                    System.out.println("I am building my own pizza");

                }else{   // ready pizza in the system

                    System.out.println("We have received your order. Price is $19.99");

                }

                System.out.println("Your oder number is " + generateOrderNumber(email));
                break;

            }else{
                System.out.println("You have entered invalid pizza name. Please try again");
            }

        }

    }

    private static String generateOrderNumber(String email) {  // mike@gmail.com

        String orderNumber = "order_";

        for (int i = 0; i < email.length()-1; i++) {

            orderNumber += email.substring(i,i+1);
            orderNumber += i;
        }
        return orderNumber;
    }

    private static boolean checkPizzaThatWeHave(String pizzaChoice) {

        String pizza1 = "Margarita";
        String pizza2 = "Salami";
        String pizza3 = "Veggie";
        String pizza4 = "FourCheese";
        String pizzaSpecial = "Special";

        return pizzaChoice.equalsIgnoreCase(pizza1) ||
                        pizzaChoice.equalsIgnoreCase(pizza2) ||
                        pizzaChoice.equalsIgnoreCase(pizza3) ||
                        pizzaChoice.equalsIgnoreCase(pizza4) ||
                        pizzaChoice.equalsIgnoreCase(pizzaSpecial);

    }

    private static String login(){

        // creat 3 variables named email(String), account number(int), password and assign values
        String email = "mike@gmail.com";
        int accountNumber = 123; // account number can be between >100 and <1000
        String password = "password";

        // ask customer if he/she wants to log in with email(1) or account number(2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1, Account number: 2");
        int loginType = scanner.nextInt();

        for (int i = 3; i > 0; ) { // infinite loop
            //create the selection flow for the login type
            switch (loginType) {

                case 1:   // if I choose login type - 1, should do credential check

                    //Enter your email
                    System.out.println("Enter your email: ");
                    String givenEmail = scanner.next();


                    if (!isInputValid(givenEmail)) {
                        System.out.println("Invalid Email. Please try again...");
                        continue;
                    }


                    //Enter your password
                    System.out.println("Enter your password: ");
                    String givenPassword = scanner.next();

                    // check if login successful
                    if (email.equals(givenEmail) && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in with email");
                        break;

                    } else {  // invalid checking

                        if (i != 1) {//ask again

                            System.out.println("Invalid credentials!! left " + (i - 1) + " chances to try");

                            i--;  // i = i-1;
                            continue;  // do not execute anything after this point, go back to for loop
                            // break;   stop the loop here, and exit the loop
                            // return;  stop the method you are inside

                        } else {
                            System.out.println("Your account is blocked - try again tomorrow");
                            System.exit(0);  // close the execution of JVM

                        }

                    }


                case 2:
                    System.out.println("Please type your account number: ");
                    int an = scanner.nextInt();

                    //invalid and try again
                    if (!isInputValid(an)) {
                        System.out.println("Your account number is invalid! Please try again.");
                        continue;
                    }

                    System.out.println("Please enter your password: ");
                    givenPassword = scanner.next();

                    // check if login successful
                    if (an == accountNumber && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in with account number");
                        break;

                    } else {  // invalid checking

                        if (i != 1) {//ask again

                            System.out.println("Invalid credentials!! left " + (i - 1) + " chances to try");

                            i--;  // i = i-1;
                            continue;  // do not execute anything after this point, go back to for loop
                            // break;   stop the loop here, and exit the loop
                            // return;  stop the method you are inside

                        } else {
                            System.out.println("Your account is blocked - try again tomorrow");
                            System.exit(0);  // close the execution of JVM

                        }


                        break;   // stop the switch-case
                    }


            }

            break;// stop the for loop

        }

        return email;

    }
    private static boolean isInputValid(int an) {

        return (an >= 100 && an < 1000)?true:false;
    }
    public static boolean isInputValid(String givenEmail){

            //check if the email address is valid:
            //if @ . available , and @ is before .

            int firstSignOfIndex = givenEmail.indexOf('@');
            int secondSignOfIndex = givenEmail.indexOf('.');

            boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;


            if (checkEmail) {
                return false;
            }

            return isEmailDomainValid(givenEmail);
        }
    public static boolean isEmailDomainValid (String givenEmail){

            // check if domain is valid
            String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));
            boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        /*

        if (!checkDomain) {
            System.out.println("Invalid Domain");
        }
         */
            return checkDomain;
        }
    }

