package lesson.java.Inheritance;

public class Triangle extends Figure{
    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double dimension() {
        return super.dimension() / 2;
    }
}
