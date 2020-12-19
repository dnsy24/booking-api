package com.example.bookingapi.data.provider;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataProviderImpl implements DataProvider {

//    @Autowired
//    private Faker faker;
    private final Faker faker = new Faker();

    private static DataProviderImpl instance;

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
        return List.of("English", "German", "French");
    }

    @Override
    public String createAdditionalNeeds() {
        return Math.random() < 0.5 ? "Breakfast" : "n/a";
    }

    public static DataProviderImpl booking() {
        if (instance == null) {
            instance = new DataProviderImpl();
        }
        return instance;
    }

}
