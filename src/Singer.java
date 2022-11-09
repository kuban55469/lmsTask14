public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Learn new song");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("In area.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Breakfast.");
    }

    public void singing() {
        System.out.println("Singing a song 'Winter!'");
    }

    public void playGuitar() {
        System.out.println("Rapping with guitar!");

    }

    @Override
    public String toString() {
        return "Singer" + "\nName: " + super.getName() +
                "\nDesignation: " + super.getDesignation() +
                "\nBand name: " + bandName;
    }
}
