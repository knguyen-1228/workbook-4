package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, double reservationTotal){
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if(getRoomType().equalsIgnoreCase("king")){
            if (isWeekend() == true){
                price *= (139 *1.10) * getNumberOfNights();
            }else {
                price = 139 * getNumberOfNights();
            }
        }else if (getRoomType().equalsIgnoreCase("double")){
            if (isWeekend() == true){
                price *= (124*1.10) * getNumberOfNights();
            }else {
                price = 124 * getNumberOfNights();
            }
        }else{
            System.out.println("Invalid choice");
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public double getReservationTotal() {
        reservationTotal = getPrice();
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

}
