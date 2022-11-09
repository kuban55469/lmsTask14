public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Kuban", "Junior", "Google");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println();

        Dancer dancer = new Dancer("Maks", "Walts", "BigBaby");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println();

        Singer singer = new Singer("Tolik", "Melodist", "Kino");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();

    }
}