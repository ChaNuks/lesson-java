package lesson.java.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getAllProducts() {
        return this.products;
    }

    public long computeTotalPrice() {
        long totalPrice = 0;

        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}
