package com.bvk;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HolidayHelper {

    public boolean holiday(String date) {
        LocalDate tanggal = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return tanggal.getDayOfWeek() == DayOfWeek.SATURDAY || tanggal.getDayOfWeek() == DayOfWeek.SUNDAY;
    }
}
