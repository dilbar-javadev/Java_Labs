package lab06_Methods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        System.out.println(helloName("Bob"));

        System.out.println(makeABBA("Hi", "Bye"));

        System.out.println(extraEnd("Hi"));

        System.out.println(firstTwo("Hello"));

        System.out.println(withoutEnd("Hello"));



    }

    public static String helloName(String name){
        return "Hello " + name + "!";
    }

    public static String makeABBA(String a, String b){
     /*   String result = "";
        result += a;
        result += b;
        result += b;
        result += a;

        return result;
      */
        return a + b + b + a;
    }

    public static String extraEnd(String str){
        if(str.length() < 2){
            return str;
        }

        String subString = str.substring(str.length()-2);   // last two characters of the string
        return subString.repeat(3);
    }

    public static String firstTwo(String str){
        if(str.length() < 2){
            return str;
        }

        return str.substring(0,2);
    }

    public static String withoutEnd(String str){
        if(str.length() < 3){
            return str;
        }
        return str.substring(1,str.length()-1);
    }
}
