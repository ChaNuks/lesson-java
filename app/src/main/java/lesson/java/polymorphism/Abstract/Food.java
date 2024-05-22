package lesson.java.polymorphism.Abstract;

public abstract class Food {

    private int calorie;

    public Food(int calorie) {
        this.calorie = calorie;
    }

    public abstract void eat();

    void badFood() {
        System.out.println("그러므로 살찐다.");
    }

    void printCalorie() {
        System.out.println("칼로리는 " + this.calorie + "kcal이다." );
    }
}
