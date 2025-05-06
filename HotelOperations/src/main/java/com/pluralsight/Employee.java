package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private double punchInTime;
    private double punchOutTime;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }
    public void punchIn(double time){
        this.punchInTime = time;
    }
    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        double time = (now.getHour() + now.getMinute()) /60;
        punchIn(time);
    }
    public void punchOut(double time){
        this.punchOutTime = time;
        this.hoursWorked += (punchOutTime - punchInTime);
    }
    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();
        double time = (now.getHour() + now.getMinute()) /60;
        punchOut(time);
    }

    public double getRegularHours(){
        double regularHours = 0;
        if (hoursWorked <= 40){
            regularHours = hoursWorked * payRate;
            return  regularHours;
        }else {
            return regularHours;
        }
    }
    public double getOverTime(){
        double overTime = 0;
        if (hoursWorked > 40){
            overTime = ((payRate * 1.5) * (hoursWorked-40)) + (payRate * 40);
            return  overTime;
        }else {
            return overTime;
        }
    }
    public double totalPay(){
        return getOverTime() + getRegularHours();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPunchInTime() {
        return punchInTime;
    }

    public void setPunchInTime(double punchInTime) {
        this.punchInTime = punchInTime;
    }

    public double getPunchOutTime() {
        return punchOutTime;
    }

    public void setPunchOutTime(double punchOutTime) {
        this.punchOutTime = punchOutTime;
    }
}
