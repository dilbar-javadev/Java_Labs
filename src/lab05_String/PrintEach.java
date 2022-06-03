package lab05_String;

public class PrintEach {

    public static void main(String[] args) {

        String word = "Wooden Spoon";

        //System.out.println(word.charAt(0));

        // .....

        for (int i = 1; i < word.length(); i++) {

            char each = word.charAt(i);
            System.out.println(each);

        }


    }
}
