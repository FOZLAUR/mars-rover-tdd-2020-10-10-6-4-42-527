package exceptions;

public class CommandNotDefinedException extends Exception{
    public CommandNotDefinedException() {
        super("This contains an undefined command");
    }
}
