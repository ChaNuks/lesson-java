package lesson.java.solid.assignment.ocpExample.CorrectExample;

public class Main {

    public static void main(String[] args) {

        AppleStore appleStore = new AppleStore();

        Product macbookPro13 = new Laptop("MacBook Pro 13", 25000);
        Product iphone12 = new Phone("iPhone 12", 9999);
        Product iPadPro = new IPad("iPad Pro", 7566);
        Product macbookAir = new Laptop("MacBook Air", 1250);
        Product macbookPro16 = new Laptop("MacBook Pro 16", 2799);

        appleStore.addProduct(macbookPro13);
        appleStore.addProduct(iphone12);
        appleStore.addProduct(iPadPro);
        appleStore.addProduct(macbookAir);
        appleStore.addProduct(macbookPro16);

        OutputView outputView = new OutputView();
        outputView.printResult(appleStore.getProducts());
    }
}
