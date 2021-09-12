package com.bridgelabz;

public class Hotels {
    private String hotelName;
    private int regularCustRate;
    private int weekDayRate;
    private int weekEndRate;
    private int hotelRating;

    public Hotels(String hotelName, int regularCustRate, int weekDayRate, int weekEndRate, int hotelRating) {
        this.hotelName = hotelName;
        this.regularCustRate = regularCustRate;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
        this.hotelRating = hotelRating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegularCustRate() {
        return regularCustRate;
    }

    public void setRegularCustRate(int regularCustRate) {
        this.regularCustRate = regularCustRate;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public int getWeekEndRate() {
        return weekEndRate;
    }

    public void setWeekEndRate(int weekEndRate) {
        this.weekEndRate = weekEndRate;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "hotelName='" + hotelName + '\'' +
                ", regularCustRate=$" + regularCustRate +
                ", weekDayRate=$" + weekDayRate +
                ", weekEndRate=$" + weekEndRate +
                '}';
    }
}