package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_is_trueWhenCheckedIn(){
        //arrange
        Room room = new Room(2,139,false,false);
        //act
        room.checkIn();
        //assert
        assertTrue(room.isOccupied() && room.isDirty());
    }
    @Test
    public void checkOut_is_falseWhenCheckedOut(){
        //arrange
        Room room1 = new Room(2,139,true,true);
        //act
        room1.checkOut();
        //assert
        assertFalse(room1.isAvailable() && room1.isDirty());
    }
    @Test
    public void cleanRoom_isFalseWhenCleaned(){
        //arrange
        Room room2 = new Room(2,139,true,true);
        //act
        room2.cleanRoom();
        //assert
        assertFalse(room2.isDirty());
    }

}