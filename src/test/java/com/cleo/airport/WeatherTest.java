package com.cleo.airport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WeatherTest {
    Weather weather;

    @Mock
    private Random mockRandom;

    @InjectMocks
    private Weather mockWeather;


    @BeforeEach
    void init()
    {
        weather = new Weather(new Random());
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void WeatherToCreateInstanceOfWeather()
    {
        assertThat(weather, instanceOf(Weather.class));
    }

    @Test
    void WeatherToGenerateStormyWeather()
    {
        mockWeather = new Weather(mockRandom);
        when(mockRandom.nextBoolean()).thenReturn(true);

        assertEquals(true, mockWeather.stormy());
    }
}
