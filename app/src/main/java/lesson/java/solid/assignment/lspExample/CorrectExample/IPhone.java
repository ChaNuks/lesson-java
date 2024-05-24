package lesson.java.solid.assignment.lspExample.CorrectExample;

public class IPhone implements Phone{

    @Override
    public void call() {
        System.out.println("통화가 된다.");
    }

    @Override
    public void message() {
        System.out.println("문자도 된다.");
    }
}
