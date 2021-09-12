package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    @Test
    void givenHotelDetails_WhenAdded_ShouldReturnTrue() {
        System.out.println("Welcome to Hotel Reservation Program");
        HotelService hotelService = new HotelService();
        try {
            boolean hotelOne = hotelService.addHotelToList("Lakewood", 110, 110, 90,3);
            boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160, 150, 50,4);
            boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220, 220, 150,5);
            Assertions.assertTrue(hotelOne);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenHotelDetails_WhenFoundChepeastOnRegRate_ShouldReturnTrue() {
        HotelService hotelService = new HotelService();
        boolean hotelOne = hotelService.addHotelToList("Lakewood", 110, 110, 90,3);
        boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160, 150, 50,4);
        boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220, 220, 150,5);
        try {
            Hotels cheapestHotel = hotelService.toFindCheapestOnRegRate("10Sep2020", "11Sep2020");
            Assertions.assertEquals("Lakewood", cheapestHotel.getHotelName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenHotelDeatails_WhenFoundCheapestOnWeekDay_ShouldReturnTrue() {
        HotelService hotelService = new HotelService();
        boolean hotelOne = hotelService.addHotelToList("Lakewood", 110, 110, 90,3);
        boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160, 150, 50,4);
        boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220, 220, 150,5);
        try {
            Hotels cheapestHotel = hotelService.toFindCheapestOnWeekDay("11Sep2020", "12Sep2020", "weekday");
            Assertions.assertEquals("Lakewood", cheapestHotel.getHotelName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenHotelDeatails_WhenFoundCheapestOnweekEnd_ShouldReturnTrue() {
        HotelService hotelService = new HotelService();
        boolean hotelOne = hotelService.addHotelToList("Lakewood", 110, 110, 90, 3);
        boolean hotelTwo = hotelService.addHotelToList("Bridgewood", 160, 150, 50,4);
        boolean hotelThree = hotelService.addHotelToList("Ridgewood", 220, 220, 150,5);
        try {
            Hotels cheapestHotel = hotelService.toFindCheapestOnWeekDay("11Sep2020", "12Sep2020", "weekend");
            Assertions.assertEquals("Bridgewood", cheapestHotel.getHotelName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}