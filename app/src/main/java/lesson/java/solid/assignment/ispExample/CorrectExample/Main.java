package lesson.java.solid.assignment.ispExample.CorrectExample;

import lesson.java.solid.assignment.ispExample.InCorrectExample.HouseCat;
import lesson.java.solid.assignment.ispExample.InCorrectExample.WildCat;

public class Main {

    public static void main(String[] args) {

        WildCat wildCat = new WildCat();
        HouseCat houseCat = new HouseCat();

        wildCat.hunt();
        wildCat.eat();
        wildCat.sleep();

        System.out.println();

        houseCat.eat();
        houseCat.sleep();
    }
}
