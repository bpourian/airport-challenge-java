package com.cleo.airport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirportTest {
    Airport airport;

    @Mock
    private Plane planeMock;

    @BeforeEach
    void init(){
        airport = new Airport();
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
        assertEquals("Plane has landed", airport.landPlane(planeMock));
    }
}
