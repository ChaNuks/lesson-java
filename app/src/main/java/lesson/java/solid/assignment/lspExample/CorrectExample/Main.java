package lesson.java.solid.assignment.lspExample.CorrectExample;

public class Main {

    public static void main(String[] args) {

        Phone galaxy = new Galaxy();
        Phone iPhone = new IPhone();

        commonFunctions(galaxy);
        commonFunctions(iPhone);

        System.out.println();

        differenceFunction((Pay) galaxy);
    }

    public static void commonFunctions(Phone phone) {
        phone.call();
        phone.message();
    }

    public static void differenceFunction(Pay pay) {
        pay.payFunction();
    }
}
