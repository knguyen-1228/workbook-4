package com.pluralsight;

public class HotelOperationApp {
    public static void main(String[] args) {
        Room room1 = new Room(2, 139.00,false,false);
        Room room2 = new Room(1, 139.00, true, true);

        System.out.println("Is room1 available: " + room1.isAvailable());
        System.out.println("Is room2 available: " + room2.isAvailable());

        room1.checkIn();
        room2.checkOut();
        System.out.println("Is room1 available: " + room1.isAvailable());
        System.out.println("Is room1 available: " + room2.isAvailable());

        Reservation res1 = new Reservation("king", 4,true);
        Reservation res2 = new Reservation("double",4,false );

        System.out.println("Reservation 1 total is: " + res1.getReservationTotal());
        System.out.println("Reservation 2 total is: " + res2.getReservationTotal());

        Employee emp1 = new Employee(123, "Kevin","Front desk",13.00,40);
        Employee emp2 = new Employee(456, "Eric","Maintenance",13.00,70);

        System.out.println(emp1.getEmployeeId()+ " "  + emp1.getName() + " "+ emp1.getDepartment() + " "+ emp1.getPayRate()+ " " + emp1.getHoursWorked() + " Total pay is: " + emp1.totalPay());
        System.out.println(emp2.getEmployeeId() + " "+ emp2.getName() + " "+ emp2.getDepartment()+ " " + emp2.getPayRate() + " "+ emp2.getHoursWorked() + " Total pay is: " + emp2.totalPay());


    }
}
