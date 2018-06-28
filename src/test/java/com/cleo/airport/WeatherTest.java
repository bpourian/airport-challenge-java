package com.cleo.airport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

public class WeatherTest {
    Weather weather;

    @BeforeEach
    void init()
    {
        weather = new Weather();
    }

    @Test
    void WeatherToCreateInstanceOfWeather()
    {
        assertThat(weather, instanceOf(Weather.class));
    }
}
