package lab09_classObject_encapsulation.scrumTask;

public class Test {

    public static void main(String[] args) {

      Tester tester1 = new Tester("Daniel", 26, 'M',"A01", "QA", 40);

        System.out.println(tester1);

        Developer developer1  = new Developer("Lorry", 26,'F', "C23", "Back-end Developer", 40, "Java");
        System.out.println(developer1);

        developer1.coding();
        developer1.fixingBug();
    }
}
