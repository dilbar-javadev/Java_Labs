package lab11_inheritance_abstraction.ScrumMaster;

public final class Tester extends Employee implements ScrumMember, WFH{

    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName() + " is testing the application");
    }

    public void createTicket(){
        System.out.println(getName() + " is creating a ticket");
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
