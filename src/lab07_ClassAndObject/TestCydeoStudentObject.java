package lab07_ClassAndObject;

public class TestCydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();
        student1.setInfo("Dilbar",29,'F',true,false, "JDB1", "Java",7);

        System.out.println(student1);
    }
}
