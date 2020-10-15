package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    final private static List<String> HEADINGS = Arrays.asList("N","E","S","W");
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
            case "M" : moveRover(); break;
            case "L" : changeHeading(command); break;
            default : System.out.println("Invalid command");
        }
    }

    private void changeHeading(String direction) {
        switch(direction){
            case "L":
                int newDirection = (HEADINGS.indexOf(heading) > 0) ? HEADINGS.indexOf(heading)-1 : 3  ;
                heading = HEADINGS.get(newDirection); break;
            default:
        }
    }

    private void moveRover() {
        switch(heading){
            case "N": y++; break;
            case "S": y--; break;
            case "E": x++; break;
            case "W": x--; break;
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
