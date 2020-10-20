package com.afs.tdd;

public class RoverStatus {
    private int x;
    private int y;
    private String currentHeading;

    public RoverStatus(int x, int y, String currentHeading) {
        this.x = x;
        this.y = y;
        this.currentHeading = currentHeading;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCurrentHeading() {
        return currentHeading;
    }

    public void setCurrentHeading(String currentHeading) {
        this.currentHeading = currentHeading;
    }

    public void incrementX(){
        x++;
    }

    public void decrementX(){
        x--;
    }

    public void incrementY(){
        y++;
    }

    public void decrementY(){
        y--;
    }
}
