package lesson.java.Inheritance;

//1. 도형 클래스를 만들고 사각형 원형 삼각형의 넓이를 구한다

public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle(2, 3);
        Figure square = new Square(4, 5);
        Figure triangle = new Triangle(5, 8);

        System.out.println(triangle.dimension());
        System.out.println(square.dimension());
        System.out.println(circle.dimension());

    }
}
