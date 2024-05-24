package lesson.java.solid.assignment.dipExample.InCorrectExample;

public class AirConditioner {

    private RemoteController remoteController;

    public AirConditioner() {
        this.remoteController = new RemoteController();
    }

    public void operate() {
        remoteController.turnOn();
        remoteController.turnOff();
    }
}
