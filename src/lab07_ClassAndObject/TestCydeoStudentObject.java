package lab07_ClassAndObject;

public class TestCydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent Cydeostudent1 = new CydeoStudent();
        Cydeostudent1.setInfo("Dilbar",29,'F',true,false, "JDB1", "Java",7);

        System.out.println(Cydeostudent1);

        System.out.println("-----------------------------------------------");

        CydeoStudent student1 = new CydeoStudent();
        CydeoStudent student2 = student1;
        CydeoStudent student3 = student2;

        student1.setInfo("Dilbar",29,'F',true,false, "JDB1", "Java",7);

        student3.age = 35;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
