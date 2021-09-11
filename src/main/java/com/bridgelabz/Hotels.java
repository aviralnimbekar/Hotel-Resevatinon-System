package com.bridgelabz;

public class Hotels {
    private String hotelName;
    private int RegularRatePerDay;

    public Hotels(String hotelName, int regularRatePerDay) {
        this.hotelName = hotelName;
        RegularRatePerDay = regularRatePerDay;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegularRatePerDay() {
        return RegularRatePerDay;
    }

    public void setRegularRatePerDay(int regularRatePerDay) {
        RegularRatePerDay = regularRatePerDay;
    }

    @Override
    public String toString() {
        return "Hotel Name= " + hotelName + ", Regular Rate = $" + RegularRatePerDay + "\n";
    }
}