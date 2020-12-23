package com.example.bookingapi.data.provider;

import lombok.Getter;

@Getter
public enum AdditionalNeeds {
    BREAKFAST("Breakfast"),
    NON_APPLICABLE("n/a");

    private String additionalNeeds;

    AdditionalNeeds(String additionalNeeds) {
        this.additionalNeeds = additionalNeeds;
    }
}
