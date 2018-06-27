package com.cleo.airport;

public class Airport {
    public String landPlane(Plane plane)
    {
        plane.land();
        return "Plane has landed";
    }

    public String takeOffPlane(Plane plane)
    {
        plane.takeOff();
        return "Plane in the air";
    }
}
