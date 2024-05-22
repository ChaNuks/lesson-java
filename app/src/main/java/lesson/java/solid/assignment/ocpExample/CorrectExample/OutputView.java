package lesson.java.solid.assignment.ocpExample.CorrectExample;

import java.util.List;

public class OutputView {

    public void printResult(List<Product> products) {
        for (Product product : products) {
            System.out.println("모델 : " + product.getModel() + ", " + "가격 : " + product.getPrice() + "달러");
        }
    }
}
