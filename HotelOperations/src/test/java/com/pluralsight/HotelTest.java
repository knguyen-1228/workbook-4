package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HotelTest {

    @Test
    public void bookRoom_should_increaseBookedSuites(){
        //arrange
        Hotel theHotel = new Hotel("Kotel",10,50);
        //act
        theHotel.bookRoom(3,true);
        //assert
        assertEquals(7, theHotel.getAvailableSuites());
    }

}