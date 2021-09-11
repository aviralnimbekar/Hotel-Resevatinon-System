package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    static List<Hotels> hotelsList = new ArrayList<>();

    boolean addHotelToList(String hotelName, int regularRatePerDay) {
        Hotels hotels = new Hotels(hotelName, regularRatePerDay);
        return hotelsList.add(hotels);
    }
}