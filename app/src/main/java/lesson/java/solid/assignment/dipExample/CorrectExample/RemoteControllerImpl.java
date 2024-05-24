package lesson.java.solid.assignment.dipExample.CorrectExample;

public class RemoteControllerImpl implements RemoteController{

    @Override
    public void turnOn() {
        System.out.println("에어컨을 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 끈다.");
    }
}
