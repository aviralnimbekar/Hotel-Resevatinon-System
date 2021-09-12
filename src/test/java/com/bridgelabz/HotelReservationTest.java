package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    @Test
    void givenHotelDetails_WhenAdded_ShouldReturnTrue() {
        System.out.println("Welcome to Hotel Reservation Program");
        HotelService hotelService = new HotelService();
        try {
            boolean hotelOne = hotelService.addHotelToList("Lakewood", 110, 110, 90);
            boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160, 150, 50);
            boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220, 220, 150);
            System.out.println(hotelService.hotelsList);
            Assertions.assertTrue(hotelOne);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenHotelDetails_WhenFoundChepeast_ShouldReturnTrue() {
        HotelService hotelService = new HotelService();
        boolean hotelOne = hotelService.addHotelToList("Lakewood", 110, 110, 90);
        boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160, 150, 50);
        boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220, 220, 150);
        try {
            Hotels cheapestHotel = hotelService.toFindCheapest("10Sep2020", "11Sep2020");
            Assertions.assertEquals("Lakewood", cheapestHotel.getHotelName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}