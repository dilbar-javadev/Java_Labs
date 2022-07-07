package ScrumMaster;

public final class ScrumMaster extends Employee{


    public ScrumMaster(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Scrum Master", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is scheduling meetings");
    }

    public void coaching(){
        System.out.println(getName() + " is coaching");
    }
}
