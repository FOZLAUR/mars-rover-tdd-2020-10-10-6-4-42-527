package com.afs.tdd;

import commands.MoveCommand;
import commands.TurnLeftCommand;
import commands.TurnRightCommand;

import java.util.List;

public class MarsRover {
    private RoverStatus roverStatus;
    private CommandInvoker commandInvoker = new CommandInvoker();

    public MarsRover(int x, int y, String heading) {
        roverStatus = new RoverStatus(x,y,heading);
    }

    public void executeBatchCommand(List<String> commands) {
        commands.stream().forEach(command -> executeCommand(command));
    }

    private void executeCommand(String command) {
        switch(command){
            case "M" : commandInvoker.executeOperation(new MoveCommand(roverStatus)); break;
            case "L" : commandInvoker.executeOperation(new TurnLeftCommand(roverStatus)); break;
            case "R" : commandInvoker.executeOperation(new TurnRightCommand(roverStatus)); break;
            default : System.out.println("Empty command");
        }
    }

    public int getLocationX() {
        return roverStatus.getX();
    }

    public int getLocationY() { return roverStatus.getY(); }

    public String getCurrentHeading() {
        return roverStatus.getCurrentHeading();
    }
}
