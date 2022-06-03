package lab05_String;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains("" + each)) {    // result.indexof(each) < 0
                result += each;
            }

        }

        System.out.println(result);

    }
}
