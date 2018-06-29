package com.cleo.airport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class AirportTest {

    @Mock
    private Plane planeMock;

    @Mock
    private Weather mockWeather;

    @InjectMocks
    private Airport airport;

    @BeforeEach
    void init(){
        airport = new Airport(mockWeather);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void AirportToCreateAInstanceOf()
    {
        assertThat(airport, instanceOf(Airport.class));
    }

    @Test
    void AirportToInstructAPlaneToLand()
    {
        when(mockWeather.isStormy()).thenReturn(false);

        assertEquals("Plane has landed", airport.landPlane(planeMock));
    }

    @Test
    void AirportToPreventLandingAsWeatherStormy()
    {
        when(mockWeather.isStormy()).thenReturn(true);

        assertEquals("Unable to land due to storm", airport.landPlane(planeMock));
    }

    @Test
    void AirportToInstructTakeOff()
    {
        when(mockWeather.isStormy()).thenReturn(false);

        assertEquals("Plane in the air", airport.takeOffPlane(planeMock));
    }

    @Test
    void AirportToNotPermitTakeOffDueToStorm()
    {
        when(mockWeather.isStormy()).thenReturn(true);

        assertEquals("Plane unable to take-off due to storm", airport.takeOffPlane(planeMock));
    }

    @Test
    void AirportToConfirmWeatherIsStormy()
    {
        when(mockWeather.isStormy()).thenReturn(true);

        assertEquals(true, airport.isStormy());
    }

    @Test
    void AirportToConfirmWeatherIsNotStormy()
    {
        when(mockWeather.isStormy()).thenReturn(false);

        assertEquals(false, airport.isStormy());
    }

    @Test
    void AirportToHaveDefaultHangarCapacity()
    {
        assertEquals(20, airport.getHangarSpaces());
    }

    @Test
    void AirportToResetDefaultHangarSpaces()
    {
        airport.setHangarSpaces(30);
        assertEquals(30, airport.getHangarSpaces());
    }

}
