public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Learn new book.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Walk around campus.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Breakfast");
    }

    public void coding() {
        System.out.println("Calculator coding!");
    }

    @Override
    public String toString() {
        return "Programmer " + "\nName: " + super.getName() +
                "\nDesignation: " + super.getDesignation() +
                "\nCompany name: " + companyName;
    }

}
