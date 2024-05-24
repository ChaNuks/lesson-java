package lesson.java.solid.assignment.lspExample.InCorrectExample;

public class Main {

    public static void main(String[] args) {

        Phone galaxy = new Galaxy();
        Phone iPhone = new IPhone();

        payFunction(galaxy);
        payFunction(iPhone);
    }

    public static void payFunction(Phone phone) {
       phone.pay();
    }
}
