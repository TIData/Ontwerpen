package command;

import domein.*;

public class RemoteControlApp {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
