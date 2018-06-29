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

        if (this.isStormy() == false) {
            plane.takeOff();
            return "Plane in the air";
        } if (this.isStormy() == true) {
            return "Plane unable to take-off due to storm";
        } else return "Unable to access weather information";

    }

    public boolean isStormy() {
        return this.weather.isStormy();
    }
}
