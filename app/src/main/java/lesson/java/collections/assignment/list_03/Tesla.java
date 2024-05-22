package lesson.java.collections.assignment.list_03;

import java.time.YearMonth;

public class Tesla implements Car{

    private final String model;
    private final int price;
    private final YearMonth deliveryDate;

    public Tesla(String model, int price, YearMonth deliveryDate) {
        this.model = model;
        this.price = price;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public YearMonth getDeliveryDate() {
        return this.deliveryDate;
    }
}
