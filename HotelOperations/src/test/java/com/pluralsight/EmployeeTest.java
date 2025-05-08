package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchIn_correctTime(){
        //arrange
        Employee emp1 = new Employee(123,"Kevin", "Front Desk",13.00,12);

        //act
        emp1.punchIn();
        //assert
        assertTrue(emp1.getPunchInTime()>0);
    }

    @Test
    public void punchOut_currectTime(){
        //arrange
        Employee emp2 = new Employee(234,"Kevin","CEO",300,50);
        //act
        emp2.punchIn();
        emp2.punchOut();
        //assert
        assertTrue(emp2.getPunchOutTime()>0);
    }

}