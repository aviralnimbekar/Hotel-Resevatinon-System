package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

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

    Hotels toFindCheapestOnWeekDay(String checkin, String checkout) throws ParseException {
        Date checkinDate = new SimpleDateFormat("ddMMMyyyy").parse(checkin);
        Date checkoutDate = new SimpleDateFormat("ddMMMyyyy").parse(checkout);
        Hotels cheapestHotelWeekEnd, cheapestHotelWeekDay;
        int cheapestHotel;
        if (checkinDate.toString().startsWith("S")) {
            cheapestHotelWeekEnd = hotelsList.stream().min(Comparator.comparingInt(Hotels::getWeekEndRate)).get();
            cheapestHotel = cheapestHotelWeekEnd.getWeekDayRate() + cheapestHotelWeekEnd.getWeekEndRate();
            System.out.println("Cheapest Hotel :: " + cheapestHotelWeekEnd.getHotelName() + ", Total Rates: $" + cheapestHotel);
            return cheapestHotelWeekEnd;
        } else {
            cheapestHotelWeekDay = hotelsList.stream().min(Comparator.comparingInt(Hotels::getWeekDayRate)).get();
            cheapestHotel = cheapestHotelWeekDay.getWeekDayRate() + cheapestHotelWeekDay.getWeekEndRate();
            System.out.println("Cheapest Hotel :: " + cheapestHotelWeekDay.getHotelName() + ", Total Rates: $" + cheapestHotel);
            return cheapestHotelWeekDay;
        }
    }

    Hotels toFindCheapestOnWeekEnd(String checkin, String checkout) throws ParseException {
        Date checkinDate = new SimpleDateFormat("ddMMMyyyy").parse(checkin);
        Date checkoutDate = new SimpleDateFormat("ddMMMyyyy").parse(checkout);
        Hotels cheapestHotelWeekEnd, cheapestHotelWeekDay;
        int cheapestHotel;
        if (checkoutDate.toString().startsWith("S")) {
            cheapestHotelWeekEnd = hotelsList.stream().min(Comparator.comparingInt(Hotels::getWeekEndRate)).get();
            cheapestHotel = cheapestHotelWeekEnd.getWeekDayRate() + cheapestHotelWeekEnd.getWeekEndRate();
            System.out.println("Cheapest Hotel :: " + cheapestHotelWeekEnd.getHotelName() + ", Total Rates: $" + cheapestHotel);
            return cheapestHotelWeekEnd;
        } else {
            cheapestHotelWeekDay = hotelsList.stream().min(Comparator.comparingInt(Hotels::getWeekDayRate)).get();
            cheapestHotel = cheapestHotelWeekDay.getWeekDayRate() + cheapestHotelWeekDay.getWeekEndRate();
            System.out.println("Cheapest Hotel :: " + cheapestHotelWeekDay.getHotelName() + ", Total Rates: $" + cheapestHotel);
            return cheapestHotelWeekDay;
        }
    }
}