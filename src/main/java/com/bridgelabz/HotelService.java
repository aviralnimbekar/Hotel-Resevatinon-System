package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class HotelService {
    List<Hotels> hotelsList = new ArrayList<>();

    boolean addHotelToList(String hotelName, int regularRatePerDay, int weekdayRatePerDay, int weekendRatePerDay) {
        Hotels hotels = new Hotels(hotelName, regularRatePerDay, weekdayRatePerDay, weekendRatePerDay);
        return hotelsList.add(hotels);
    }

    Hotels toFindCheapest(String checkin, String checkout) throws ParseException {
        Hotels cheapestHotel = hotelsList.stream().min(Comparator.comparingInt(Hotels::getRegularRatePerDay)).get();
        Date checkinDate = new SimpleDateFormat("ddMMMyyyy").parse(checkin);
        Date checkoutDate = new SimpleDateFormat("ddMMMyyyy").parse(checkout);
        int noOfDays = (int) ((checkoutDate.getTime() - checkinDate.getTime()) / (1000 * 60 * 60 * 24) + 1);
        int totalRate = cheapestHotel.getRegularRatePerDay() * noOfDays;
        System.out.println("Cheapest Hotel :: " + cheapestHotel.getHotelName() + ", Total Rates: $" + totalRate);
        return cheapestHotel;
    }
}