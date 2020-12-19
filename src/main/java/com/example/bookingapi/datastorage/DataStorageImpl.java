package com.example.bookingapi.datastorage;

import com.example.bookingapi.data.BookingDates;
import com.example.bookingapi.datastorage.config.DataStorage;

import java.util.*;

import static com.example.bookingapi.data.provider.DataProviderImpl.*;


public class DataStorageImpl implements DataStorage {

    private long id;

    @Override
    public List<Map<String, Object>> getBookingList() {
        int count = 10;
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(createSingleBooking());
        }
        return list;
    }

    private Map<String, Object> createSingleBooking() {

        return new LinkedHashMap<>() {
            {
                put("booking_id", ++id);
                put("name", booking().createName());
                put("lastname", booking().createLastName());
                put("price", booking().createPrice());
                put("paid", booking().isPaid());
                put("city", booking().createCity());
                put("languages", booking().createLanguages());
                put("booking_dates", new BookingDates());
                put("additional_needs", booking().createAdditionalNeeds());
            }
        };

    }
}

