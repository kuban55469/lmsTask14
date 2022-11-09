public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("New dance.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Walk shopping.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Breakfast");
    }

    public void dancing() {
        System.out.println("Dancing TANGO!");
    }

    @Override
    public String toString() {
        return "Dancer" + "\nName: " + super.getName() +
                "\nDesignation: " + super.getDesignation() +
                "\nGroup name: " + groupName;
    }
}
