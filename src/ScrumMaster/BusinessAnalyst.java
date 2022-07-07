package ScrumMaster;

public final class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " gathering requirement documents");
    }

    public void analyze(){
        System.out.println(getName() + " is analyzing the requirements");
    }
}
