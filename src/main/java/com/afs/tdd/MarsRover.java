package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private String heading;

    public MarsRover(int x, int y, String heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public void executeBatchCommand(List<String> commands) {
        commands.stream().forEach(command -> executeCommand(command));
    }

    private void executeCommand(String command) {
        switch(command){
            case "M" : move(); break;
            default : System.out.println("Invalid command");
        }
    }

    private void move() {
        switch(heading){
            case "N": y++; break;
            case "S": y--; break;
            default : System.out.println("Invalid heading");
        }
    }

    public int getLocationX() {
        return x;
    }

    public int getLocationY() {
        return y;
    }

    public String getHeading() {
        return heading;
    }
}
