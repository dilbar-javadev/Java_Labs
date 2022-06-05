package lab07_ClassAndObject;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isMarried;
    public boolean isEmployed;
    public String batch;
    public String programmingLanguage;
    public int groupNumber;

    public void setInfo(String name, int age, char gender, boolean isMarried, boolean isEmployed, String batch, String programmingLanguage, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.batch = batch;
        this.programmingLanguage = programmingLanguage;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch='" + batch + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}


/*
Create a custom class for CydeoStudent objects.
1. In each object, user should be able to store the name, age, gender,
isMarried, isEmployeed, batch, programming language, and group
number information of the Cydeo student
2. Add a function named setInfo that allows the user to be able to
set all the fields of the Cydeo student
3. Add a function named study that can print the name and
programming language the student studying
4. Add a function that allows the user to be able to display each
objects’ name, age, gender, batch and programming language of
the student when it’s passed in the print statement

 */
