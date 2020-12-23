package com.example.bookingapi.data.provider;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static com.example.bookingapi.data.provider.AdditionalNeeds.BREAKFAST;
import static com.example.bookingapi.data.provider.AdditionalNeeds.NON_APPLICABLE;
import static com.example.bookingapi.data.provider.Languages.*;

@Component
public class DataProviderImpl implements DataProvider {

    private final Faker faker = new Faker();

    private static DataProviderImpl instance;

    private final List<String> languages = Arrays.asList(ENGLISH.getLanguage(), GERMAN.getLanguage(), FRENCH.getLanguage());

    @Override
    public String createName() {
        return faker.name().firstName();
    }

    @Override
    public String createLastName() {
        return faker.name().lastName();
    }

    @Override
    public double createPrice() {
        return faker.number().randomDouble(2, 100, 999);
    }

    @Override
    public boolean isPaid() {
        return Math.random() < 0.7;
    }

    @Override
    public String createCity() {
        return faker.address().city();
    }

    @Override
    public List<String> createLanguages() {
        return languages;
    }

    @Override
    public String createAdditionalNeeds() {
        return Math.random() < 0.6 ? BREAKFAST.getAdditionalNeeds() : NON_APPLICABLE.getAdditionalNeeds();
    }

    public static DataProviderImpl booking() {
        if (instance == null) {
            instance = new DataProviderImpl();
        }
        return instance;
    }

}
