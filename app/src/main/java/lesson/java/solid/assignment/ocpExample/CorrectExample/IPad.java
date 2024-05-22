package lesson.java.solid.assignment.ocpExample.CorrectExample;

public class IPad implements Product{

    private String model;
    private int price;

    public IPad(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
