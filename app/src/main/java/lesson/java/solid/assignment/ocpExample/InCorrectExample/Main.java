package lesson.java.solid.assignment.ocpExample.InCorrectExample;

public class Main {

    public static void main(String[] args) {

        AppleStore appleStore = new AppleStore();

        Laptop macbook = new Laptop("MacBook Pro", 1000);
        Phone iPhone = new Phone("iPhone 13", 2000);
        IPad iPad = new IPad("iPad Air", 3000);
        IPad iPadAir = new IPad("iPad Air 5", 3300);
        Phone iPoneSE = new Phone("iPhone SE", 2500);

        appleStore.addLaptop(macbook);
        appleStore.addPhone(iPhone);
        appleStore.addIPad(iPad);
        appleStore.addIPad(iPadAir);
        appleStore.addPhone(iPoneSE);

        OutputView outputView = new OutputView();
        outputView.printResult(appleStore.getLaptops(), appleStore.getPhones(), appleStore.getIPads());
    }
}
