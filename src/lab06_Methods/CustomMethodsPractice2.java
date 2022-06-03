package lab06_Methods;

public class CustomMethodsPractice2 {

    public static void main(String[] args) {

        System.out.println(comboString("Hello", "Pizza"));

        System.out.println(left2("Java"));

        System.out.println(right2("Hello"));
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
}
