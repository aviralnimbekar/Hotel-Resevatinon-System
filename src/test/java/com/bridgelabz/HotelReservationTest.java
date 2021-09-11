package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    @Test
    void givenHotelOne_WhenAdded_ShouldReturnTrue() {
        System.out.println("Welcome to Hotel Reservation Program");
        HotelService hotelService = new HotelService();
        try {
            boolean hotelOne = hotelService.addHotelToList("Lakewood", 110);
            boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160);
            boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220);
            System.out.println(HotelService.hotelsList);
            Assertions.assertTrue(hotelOne);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}