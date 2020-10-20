package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    final private static List<String> HEADINGS = Arrays.asList("N","E","S","W");
    private RoverStatus roverStatus;

    public MarsRover(int x, int y, String heading) {
        roverStatus = new RoverStatus(x,y,heading);
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
        String currentHeading = roverStatus.getCurrentHeading();
        switch(direction){
            case "L":
                newHeading = (HEADINGS.indexOf(currentHeading) > 0) ? HEADINGS.indexOf(currentHeading)-1 : 3  ;
                roverStatus.setCurrentHeading(HEADINGS.get(newHeading));
                break;
            case "R" :
                newHeading = (HEADINGS.indexOf(currentHeading) < 3) ? HEADINGS.indexOf(currentHeading)+1 : 0;
                roverStatus.setCurrentHeading(HEADINGS.get(newHeading));
                break;
            default:
        }
    }

    private void moveRover() {
        String currentHeading = roverStatus.getCurrentHeading();
        switch(currentHeading){
            case "N": roverStatus.incrementY(); break;
            case "S": roverStatus.decrementY();; break;
            case "E": roverStatus.incrementX(); break;
            case "W": roverStatus.decrementX();; break;
            default :
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
