package com.cleo.airport;

public class Airport {
    public String landPlane(Plane plane)
    {
        plane.land();
        return "Plane has landed";
    }
}
