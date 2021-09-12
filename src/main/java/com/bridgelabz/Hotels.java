package com.bridgelabz;

public class Hotels {
    private String hotelName;
    private int regularRatePerDay;
    private int weekdayRatePerDay;
    private int weekendRatePerDay;

    public Hotels(String hotelName, int regularRatePerDay, int weekdayRatePerDay, int weekendRatePerDay) {
        this.hotelName = hotelName;
        this.regularRatePerDay = regularRatePerDay;
        this.weekdayRatePerDay = weekdayRatePerDay;
        this.weekendRatePerDay = weekendRatePerDay;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegularRatePerDay() {
        return regularRatePerDay;
    }

    public void setRegularRatePerDay(int regularRatePerDay) {
        this.regularRatePerDay = regularRatePerDay;
    }

    public int getWeekdayRatePerDay() {
        return weekdayRatePerDay;
    }

    public void setWeekdayRatePerDay(int weekdayRatePerDay) {
        this.weekdayRatePerDay = weekdayRatePerDay;
    }

    public int getWeekendRatePerDay() {
        return weekendRatePerDay;
    }

    public void setWeekendRatePerDay(int weekendRatePerDay) {
        this.weekendRatePerDay = weekendRatePerDay;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "hotelName='" + hotelName + '\'' +
                ", regularRatePerDay=$" + regularRatePerDay +
                ", weekdayRatePerDay=$" + weekdayRatePerDay +
                ", weekendRatePerDay=$" + weekendRatePerDay +
                '}';
    }
}