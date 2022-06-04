package lab06_Methods;

import java.sql.SQLOutput;

public class CustomMethodsPractice2 {

    public static void main(String[] args) {

        System.out.println(comboString("Hello", "Pizza"));

        System.out.println(left2("Java"));

        System.out.println(right2("Hello"));

        System.out.println(frontAgain("edited"));

        System.out.println(countHi("Hi Hi Hi Hi"));

        System.out.println(catDog("Cat Cat Dog Dog Dog"));
    }

    public static String comboString(String a, String b){

        if(a.length() > b.length()){
            return b + a + b;
        }else if(b.length() > a.length()){
            return a + b + a;
        }else{
            return a + b;
        }
    }

    public static String left2(String str){
       if(str.length() < 3){
           return str;
       }
        return str.substring(2) + str.substring(0,2);
    }

    public static String right2(String str){

        if(str.length() < 3){
            return str;
        }

        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }

    public static boolean frontAgain(String str){

        if(str.length() < 2){
            return false;
        }

        return str.substring(0,2).equals(str.substring(str.length()-2));

        //  return firstTwoCharacters.endsWith(lastTwoCharacters);
    }

    public static int countHi(String str){
        return StringUtility.frequency(str,"Hi");
    }

    public static boolean catDog(String str){
        str = str.toLowerCase();
        int countCat = StringUtility.frequency(str,"cat");
        int countDog = StringUtility.frequency(str,"dog");
        return countCat == countDog;
    }
}
