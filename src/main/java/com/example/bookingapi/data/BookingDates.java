package com.example.bookingapi.data;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;

@Getter
@ToString
public class BookingDates {
    private final String checkIn;
    private final String checkOut;

    public BookingDates() {
        this.checkIn = LocalDate.now().minusDays(new Random().nextInt(15)).toString();
        this.checkOut = LocalDate.now().plusDays(new Random().nextInt(15)).toString();
    }
}
