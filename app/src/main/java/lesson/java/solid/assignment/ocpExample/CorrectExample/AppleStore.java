package lesson.java.solid.assignment.ocpExample.CorrectExample;

import java.util.ArrayList;
import java.util.List;

public class AppleStore {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
