package lesson.java.solid.assignment.lspExample.InCorrectExample;

public class IPhone extends Phone{

    @Override
    public void pay() {
        System.out.println("아이폰은 애플페이가 안 된다.");
    }
}
