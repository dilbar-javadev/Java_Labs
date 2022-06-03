package lab05_String;

public class FrequencyOfWord {

    public static void main(String[] args) {

        /*String sentence = "Java Java Java Java Python C# Ruby";

        int original_Length = sentence.length();

        String temp = sentence;  // "Java Java Java Java Python C# Ruby"

        temp = temp.replace("Java", "aaa");  //  "aaa aaa aaa aaa Python C# Ruby"

        int new_length = temp.length();

        System.out.println(original_Length);
        System.out.println(new_length);

        */

        String sentence = "Java Java Java Java Python C# Ruby Java Java";
        String temp = sentence.replace("Java", "abc");
        int totalNumberOfJava = sentence.length() - temp.length();

        System.out.println(totalNumberOfJava);
    }
}
