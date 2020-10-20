package commands;

import com.afs.tdd.CommandExecutor;
import com.afs.tdd.RoverStatus;

public class TurnRightCommand implements Command {
    private RoverStatus roverStatus;
    private CommandExecutor commandExecutor;

    public TurnRightCommand(RoverStatus roverStatus){
        this.roverStatus = roverStatus;
        commandExecutor = new CommandExecutor(roverStatus);
    }

    public void execute(){
        commandExecutor.turnRight();
    }
}
