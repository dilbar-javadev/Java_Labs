package lab11_inheritance_abstraction.ScrumMaster;

public class Developer extends Employee implements ScrumMember, WFH{


    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName() + " is coding");
    }

    public void fixBug(){
        System.out.println(getName() + " is fixing the bug");
    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void sprintPlanning() {

    }

    @Override
    public void WorkFromHome() {

    }
}
