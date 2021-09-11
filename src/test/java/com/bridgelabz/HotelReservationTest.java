package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationTest {

    @Test
    void givenHotelDetails_WhenAdded_ShouldReturnTrue() {
        System.out.println("Welcome to Hotel Reservation Program");
        HotelService hotelService = new HotelService();
        try {
            boolean hotelOne = hotelService.addHotelToList("Lakewood", 110);
            boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160);
            boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220);
            System.out.println(hotelService.hotelsList);
            Assertions.assertTrue(hotelOne);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenHotelDetails_WhenFoundChepeast_ShouldReturnTrue() {
        HotelService hotelService = new HotelService();
        boolean hotelOne = hotelService.addHotelToList("Lakewood", 110);
        boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160);
        boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220);
        try {
            Hotels cheapestHotel = (Hotels) hotelService.toFindCheapest("10Sep2020","11Sep2020");
            Assertions.assertEquals("Lakewood" ,cheapestHotel.getHotelName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}