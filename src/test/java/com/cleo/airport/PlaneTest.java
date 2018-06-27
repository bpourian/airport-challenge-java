package com.cleo.airport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaneTest {

    Plane plane;

    @BeforeEach
    void init(){
        plane = new Plane();
    }

    @Test
    void PlaneToCreateInstanceOfPlane()
    {
        assertThat(plane, instanceOf(Plane.class));
    }

    @Test
    void PlaneToLandAndHaveStatusLanded()
    {
        plane.land();
        assertEquals("Plane has landed", plane.getStatus());
    }
}
