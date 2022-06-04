package lab06_Methods;

public class StringUtility {

    public static int frequency(String sentence, String word){

        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }

        return count;
    }

    public static int frequency(String str, char ch){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }

        return count;
    }

    public static String reverse(String word){

        String result = "";

        for (int i = word.length()-1; i >= 0 ; i--) {   // i:index number of the string (word) starting from last index to 0
            char each = word.charAt(i);   // character: starting from last character to first character
            result += each;
        }

        return result;
    }


    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains("" + each)) {    // result.indexof(each) < 0
                result += each;
            }
        }
        return result;
    }
}
