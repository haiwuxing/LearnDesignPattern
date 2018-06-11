import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args) {
        // Gets the ElectronicDevice to use
        ElectronicDevice newDevice = TVRemote.getDevice();
        
        // TurnTVOn contains the command to turn o the tv
        // When execute() is called on this command object
        // it will execute the method on() in Television
        TurnTVOn onCommand = new TurnTVOn(newDevice);
        
        // Calling the execute() causes on() to execute in Television
        DeviceButton onPressed = new DeviceButton(onCommand);
        
        // When press() is clled theCommand.execute(); executes
        onPressed.press();
        
        //----------------------------------------------------------
	// Now when execute() is called off() of Television executes
	TurnTVOff offCommand = new TurnTVOff(newDevice);
	
	// Calling the execute() causes off() to execute in Television
	onPressed = new DeviceButton(offCommand);
		
	// When press() is called theCommand.execute(); executes
	onPressed.press();
    }
}