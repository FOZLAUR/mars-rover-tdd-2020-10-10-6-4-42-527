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

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCurrentHeading() {
        return currentHeading;
    }

    public void setCurrentHeading(String currentHeading) {
        this.currentHeading = currentHeading;
    }
}
