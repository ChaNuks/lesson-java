package lesson.java.solid.assignment.lspExample.CorrectExample;

public class Galaxy implements Phone, Pay{

    @Override
    public void payFunction() {
        System.out.println("갤럭시는 삼성페이가 된다.");
    }

    @Override
    public void call() {
        System.out.println("통화도 된다.");
    }

    @Override
    public void message() {
        System.out.println("문자도 된다.");
    }
}
