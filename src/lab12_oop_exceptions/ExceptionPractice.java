package lab12_oop_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {

    public static void main(String[] args) {

        String str = null;

        try{
            String result = str.repeat(3);
            System.out.println(result);
            System.out.println("Try Block");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Catch Block");
            str = "Java";
            String result = str.repeat(3);
            System.out.println(result);
        }

        System.out.println("------------------------------------");

        try {
            new FileInputStream("src/lab12_oop_exceptions/ExceptionPractice.java");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }




    }
}
