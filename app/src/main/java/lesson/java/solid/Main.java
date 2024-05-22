package lesson.java.solid;

// 쇼핑 카트, 주문, 상품
// 총 상품 금액, 갯수 출력

public class Main {
    public static void main(String[] args) {

        Product pencil = new Product("연필", 1000);
        Product scissor = new Product("가위", 2000);

        Cart cart = new Cart();
        cart.addProduct(pencil);
        cart.addProduct(scissor);

        Order order = new Order(cart);

        System.out.println(cart);
        System.out.println(order);
        System.out.println(order);
    }
}
