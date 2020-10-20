package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    final private static List<String> HEADINGS = Arrays.asList("N","E","S","W");
    private int x;
    private int y;
    private String currentHeading;

    public MarsRover(int x, int y, String heading) {
        this.x = x;
        this.y = y;
        this.currentHeading = heading;
    }

    public void executeBatchCommand(List<String> commands) {
        commands.stream().forEach(command -> executeCommand(command));
    }

    private void executeCommand(String command) {
        switch(command){
            case "M" : moveRover(); break;
            case "L" :
            case "R" : changeHeading(command); break;
            default : System.out.println("Empty command");
        }
    }

    private void changeHeading(String direction) {
        int newHeading = -1;
        switch(direction){
            case "L":
                newHeading = (HEADINGS.indexOf(currentHeading) > 0) ? HEADINGS.indexOf(currentHeading)-1 : 3  ;
                currentHeading = HEADINGS.get(newHeading);
                break;
            case "R" :
                newHeading = (HEADINGS.indexOf(currentHeading) < 3) ? HEADINGS.indexOf(currentHeading)+1 : 0;
                currentHeading = HEADINGS.get(newHeading);
                break;
            default:
        }
    }

    private void moveRover() {
        switch(currentHeading){
            case "N": y++; break;
            case "S": y--; break;
            case "E": x++; break;
            case "W": x--; break;
            default :
        }
    }

    public int getLocationX() {
        return x;
    }

    public int getLocationY() {
        return y;
    }

    public String getCurrentHeading() {
        return currentHeading;
    }
}
