package com.afs.tdd;

import enums.Headings;

import java.util.Arrays;
import java.util.List;

public class CommandExecutor {
    final private static List<String> HEADINGS = Arrays.asList("N","E","S","W");
    private RoverStatus roverStatus;
    private int newHeadingIndex;

    public CommandExecutor(RoverStatus roverStatus){
        this.roverStatus = roverStatus;
    }

    public void turnLeft() {
        newHeadingIndex = (getCurrentHeading().ordinal() > 0) ? getCurrentHeading().ordinal()-1 : 3;
        Headings newHeading = Headings.values()[newHeadingIndex];
        roverStatus.setCurrentHeading(newHeading.getValue());
    }

    public void turnRight() {
        newHeadingIndex = (getCurrentHeading().ordinal() < 3) ? getCurrentHeading().ordinal()+1 : 0;
        Headings newHeading = Headings.values()[newHeadingIndex];
        roverStatus.setCurrentHeading(newHeading.getValue());
    }

    public void moveRover() {
        Headings currentHeading = getCurrentHeading();
        switch(currentHeading){
            case NORTH: roverStatus.incrementY(); break;
            case SOUTH: roverStatus.decrementY(); break;
            case EAST: roverStatus.incrementX(); break;
            case WEST: roverStatus.decrementX(); break;
        }
    }

    public Headings getCurrentHeading(){
        String currentHeading = roverStatus.getCurrentHeading();
        return Arrays.asList(Headings.values())
                .stream()
                .filter(heading -> heading.getValue().equals(currentHeading))
                .findFirst()
                .orElse(null);
    }
}
