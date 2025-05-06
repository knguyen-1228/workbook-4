package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;

    }


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isAvailable() {
        if(!isDirty() && !isOccupied()) {
            return true;
        }
        return false;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public double getPrice() {
        return price;
    }

}
