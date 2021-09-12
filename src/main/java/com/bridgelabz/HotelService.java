package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HotelService {
    List<Hotels> hotelsList = new ArrayList<>();

    boolean addHotelToList(String hotelName, int regularCustRate, int weekDayRate, int weekEndRate) {
        Hotels hotels = new Hotels(hotelName, regularCustRate, weekDayRate, weekEndRate);
        return hotelsList.add(hotels);
    }

    Hotels toFindCheapestOnRegRate(String checkin, String checkout) throws ParseException {
        Hotels cheapestHotel = hotelsList.stream().min(Comparator.comparingInt(Hotels::getRegularCustRate)).get();
        Date checkinDate = new SimpleDateFormat("ddMMMyyyy").parse(checkin);
        Date checkoutDate = new SimpleDateFormat("ddMMMyyyy").parse(checkout);
        int noOfDays = (int) ((checkoutDate.getTime() - checkinDate.getTime()) / (1000 * 60 * 60 * 24) + 1);
        int totalRate = cheapestHotel.getRegularCustRate() * noOfDays;
        System.out.println("Cheapest Hotel :: " + cheapestHotel.getHotelName() + ", Total Rates: $" + totalRate);
        return cheapestHotel;
    }

    Hotels toFindCheapestOnWeekDay(String checkin, String checkout, String in) throws ParseException {
        Date checkinDate = new SimpleDateFormat("ddMMMyyyy").parse(checkin);
        Date checkoutDate = new SimpleDateFormat("ddMMMyyyy").parse(checkout);
        int noOfTotalDays = (int) ((checkoutDate.getTime() - checkinDate.getTime()) / (1000 * 60 * 60 * 24) + 1);
        int cheapestHotel, weekEnd = 0, weekDay = 0;
        int day = checkinDate.getDay();
        for (int i = 1; i <= noOfTotalDays; i++) {
            if (day == 6 || day == 0) weekEnd++;
            else weekDay++;
            if (day < 6) day++;
            else day = 0;
        }
        if (in.toLowerCase(Locale.ROOT).equals("weekday")) {
            Hotels cheapestHotelWeekDay = hotelsList.stream().min(Comparator.comparingInt(Hotels::getWeekDayRate)).get();
            cheapestHotel = cheapestHotelWeekDay.getWeekDayRate() * weekDay + cheapestHotelWeekDay.getWeekEndRate() * weekEnd;
            System.out.println("Cheapest Hotel at weekday :: " + cheapestHotelWeekDay.getHotelName() + ", Total Rates: $" + cheapestHotel);
            return cheapestHotelWeekDay;
        }
        Hotels cheapestHotelWeekEnd = hotelsList.stream().min(Comparator.comparingInt(Hotels::getWeekEndRate)).get();
        cheapestHotel = cheapestHotelWeekEnd.getWeekDayRate() * weekDay + cheapestHotelWeekEnd.getWeekEndRate() * weekEnd;
        System.out.println("Cheapest Hotel at weekend :: " + cheapestHotelWeekEnd.getHotelName() + ", Total Rates: $" + cheapestHotel);
        return cheapestHotelWeekEnd;
    }
}