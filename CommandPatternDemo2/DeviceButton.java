// This is known as the invoker
// It has a method press() that when executed
// cuases the execute method to be called

// The execute mthod for the Command interface then calss
// the motd assigned in the class that implements the 
// Command interface

public class DeviceButton {
    Command theCommand;
    
    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }
    
    public void press() {
        theCommand.execute();
    }
}