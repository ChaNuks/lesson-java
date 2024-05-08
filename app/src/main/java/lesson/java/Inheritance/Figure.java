package lesson.java.Inheritance;

public class Figure {

    protected int width;
    protected int height;


    public Figure(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double dimension() {
        return this.width * this.height;
    }
}
