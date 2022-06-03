package lab02_selectionStatements;

import java.util.Scanner;

public class TrainBookingApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to take a train or bus or flight?");
        String transportation = input.next();

        if(transportation.equalsIgnoreCase("train")){
            System.out.println("Do you have bags?");
            String bags1 = input.next();
            if(bags1.equalsIgnoreCase("yes")){
                System.out.println("Do you want NonStop?");
                String nonStop1 = input.next();
                if(nonStop1.equalsIgnoreCase("yes")){
                    System.out.println("Please take TR003, boarding time is 08:24AM");
                }else{
                    System.out.println("Please take TR004, boarding time is 01:30PM");
                }
            }else{
                System.out.println("Do you want NonStop?");
                String nonStop1 = input.next();
                if(nonStop1.equalsIgnoreCase("yes")){
                    System.out.println("Please take TR001, boarding time is 07:15AM");
                }else{
                    System.out.println("Please take TR002, boarding time is 09:30AM");
                }

            }
        }else if(transportation.equalsIgnoreCase("bus")){


        }else{

        }
    }
}
