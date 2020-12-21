package com.example.bookingapi.controller;


import com.example.bookingapi.datastorage.DataStorageImpl;
import com.example.bookingapi.exceptions.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("v1/api/booking")
public class BookingController {

    DataStorageImpl dataStorage = new DataStorageImpl();

    private List<Map<String, Object>> bookingList = dataStorage.getBookingList();

    int counter = bookingList.size();

    @GetMapping
    public List<Map<String, Object>> bookingList() {
        return bookingList;
    }

    @GetMapping("{id}")
    public Map<String, Object> bookingById(@PathVariable int id) {
        return getBookingById(id);
    }

    @PostMapping
    public Map<String, Object> createBooking(@RequestBody Map<String, Object> booking) {
        Map<String, Object> newBooking = new LinkedHashMap<>();
        newBooking.put("booking_id", ++counter);
        newBooking.putAll(booking);
        bookingList.add(newBooking);
        return booking;
    }

    @PutMapping("{id}")
    public Map<String, Object> updateBooking(@PathVariable int id, @RequestBody Map<String, String> booking) {
        Map<String, Object> bookingFromDataStorage = getBookingById(id);
        bookingFromDataStorage.putAll(booking);
        bookingFromDataStorage.put("booking_id", id);
        return bookingFromDataStorage;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        if (bookingList.isEmpty()) {
            bookingList = dataStorage.getBookingList();
        } else {
            Map<String, Object> booking = getBookingById(id);
            bookingList.remove(booking);
        }

    }


    private Map<String, Object> getBookingById(int id) {

        return bookingList.stream()
                .filter(booking -> booking.get("booking_id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

}
