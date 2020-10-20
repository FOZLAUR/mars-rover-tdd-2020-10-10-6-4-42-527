package commands;

import com.afs.tdd.CommandExecutor;
import com.afs.tdd.RoverStatus;

public class MoveCommand implements Command {
    private RoverStatus roverStatus;
    private CommandExecutor commandExecutor;

    public MoveCommand(RoverStatus roverStatus){
        this.roverStatus = roverStatus;
        commandExecutor = new CommandExecutor(roverStatus);
    }

    public void execute(){
        commandExecutor.moveRover();
    }
}
