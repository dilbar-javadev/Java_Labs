package lab05_String;

public class FrequencyOfWord3 {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C# Ruby Java Java";

        int countJava = 0;

        for (int i = 0; i <= sentence.length()-4; i++) {
            String each = sentence.substring(i,i+4);

            System.out.println(each);

            if(each.equals("Java")){
                countJava++;
            }
        }

        System.out.println(countJava);

        System.out.println("-------------------------------------------");

        String s = "Cat Cat Cat Dog Dog Dog Dog Dog Dog Dog";

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i <= s.length()-3 ; i++) {
            String each = s.substring(i,i+3); //

            if(each.equals("Cat")){
                countCat++;
            }

            if(each.equals("Dog")){
                countDog++;
            }
        }

        System.out.println("countCat = " + countCat);
        System.out.println("countDog = " + countDog);
    }
}
