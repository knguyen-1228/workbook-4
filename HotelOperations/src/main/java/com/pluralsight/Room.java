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
    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }
    public void checkOut(){
        this.cleanRoom();
        this.occupied = false;
    }
    public void cleanRoom(){
        this.dirty = false;
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
