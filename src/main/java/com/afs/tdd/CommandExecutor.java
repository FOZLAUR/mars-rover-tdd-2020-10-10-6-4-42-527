package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class CommandExecutor {
    final private static List<String> HEADINGS = Arrays.asList("N","E","S","W");
    private RoverStatus roverStatus;
    private int newHeading;

    public CommandExecutor(RoverStatus roverStatus){
        this.roverStatus = roverStatus;
    }

    public void turnLeft() {
        String currentHeading = roverStatus.getCurrentHeading();
        newHeading = (HEADINGS.indexOf(currentHeading) > 0) ? HEADINGS.indexOf(currentHeading)-1 : 3  ;
        roverStatus.setCurrentHeading(HEADINGS.get(newHeading));
    }

    public void turnRight() {
        String currentHeading = roverStatus.getCurrentHeading();
        newHeading = (HEADINGS.indexOf(currentHeading) < 3) ? HEADINGS.indexOf(currentHeading)+1 : 0;
        roverStatus.setCurrentHeading(HEADINGS.get(newHeading));
    }

    public void moveRover() {
        String currentHeading = roverStatus.getCurrentHeading();
        switch(currentHeading){
            case "N": roverStatus.incrementY(); break;
            case "S": roverStatus.decrementY();; break;
            case "E": roverStatus.incrementX(); break;
            case "W": roverStatus.decrementX();; break;
            default :
        }
    }
}
