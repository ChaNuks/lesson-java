package lesson.java.solid.assignment.dipExample.CorrectExample;

public class AirConditioner {

    private RemoteController remoteController;

    public AirConditioner(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public void operate() {
        remoteController.turnOn();
        remoteController.turnOff();
    }
}
