package lesson.java.Inheritance;

public class Circle extends Figure{

    public Circle(int width, int height) {
        super(width, height);   // super - 부모 객체 참조값, 부모의 생성자를 호출
    }

    @Override
    public double dimension() {
        return 3.14 * 3 * 3;
    }
}
