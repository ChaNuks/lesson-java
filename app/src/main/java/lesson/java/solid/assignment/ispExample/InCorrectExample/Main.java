package lesson.java.solid.assignment.ispExample.InCorrectExample;

public class Main {

    public static void main(String[] args) {

        WildCat wildCat = new WildCat();
        HouseCat houseCat = new HouseCat();

        wildCat.hunt();
        wildCat.eat();
        wildCat.sleep();

        System.out.println();

        houseCat.hunt();
        houseCat.eat();
        houseCat.sleep();
    }
}
