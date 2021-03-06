package com.citi.WeatherAlarmDB.Models;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;
import java.util.Date;

public class SetAlarm {
    private boolean hasToBeSet;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime otherTime;
    private String weather;
    private String weatherTag;
    private int degrees;

    public SetAlarm() {
    }

    public boolean isHasToBeSet() {
        return hasToBeSet;
    }

    public void setHasToBeSet(boolean hasToBeSet) {
        this.hasToBeSet = hasToBeSet;
    }

    public LocalTime getOtherTime() {
        return otherTime;
    }

    public void setOtherTime(LocalTime weatherAlarmTime) {
        this.otherTime = weatherAlarmTime;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWeatherTag() {
        return weatherTag;
    }

    public void setWeatherTag(String weatherTag) {
        this.weatherTag = weatherTag;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }
}