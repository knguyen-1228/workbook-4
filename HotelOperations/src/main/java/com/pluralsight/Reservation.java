package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;


    }
    public double getReservationTotal(){
        double total = 0;
        if (isWeekend()==true){
            total = (getPrice()*1.10)*numberOfNights;
            return total;
        } else {
            total = getPrice()*numberOfNights;
            return total;
        }
    }
    public double getPrice() {
        double price =0;
        if(getRoomType().equalsIgnoreCase("king")){
            price = 139;
            return price;
        }else if (getRoomType().equalsIgnoreCase("double")){
            price = 124;
            return price;
        }else{
            return price;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }


}
