package com.cleo.airport;

public class Airport {

    Weather weather;

    public Airport(Weather weather)
    {
        this.weather = weather;
    }

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

    public boolean isStormy() {
        return this.weather.isStormy();
    }
}
