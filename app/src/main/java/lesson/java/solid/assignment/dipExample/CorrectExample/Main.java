package lesson.java.solid.assignment.dipExample.CorrectExample;

import lesson.java.solid.assignment.dipExample.InCorrectExample.AirConditioner;

public class Main {

    public static void main(String[] args) {

        RemoteController remoteController = new RemoteControllerImpl();
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.operate();
    }
}
