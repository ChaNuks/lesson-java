package lesson.java.solid;

import lesson.java.collections.assignment.list_03.Car;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Order {

    private List<Product> products = new ArrayList<>();
    private final long totalPrice;

    public Order(Cart cart) {
        this.products = cart.getAllProducts();
        this.totalPrice = cart.computeTotalPrice();
    }

    public List<Product> getProducts() {
        return products;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
