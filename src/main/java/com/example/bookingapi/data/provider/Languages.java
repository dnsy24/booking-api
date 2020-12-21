package com.example.bookingapi.data.provider;

import lombok.Getter;

@Getter
public enum Languages {
    ENGLISH("English"),
    GERMAN("German"),
    FRENCH("French");

    private String language;

    Languages(String language) {
        this.language = language;
    }
}
