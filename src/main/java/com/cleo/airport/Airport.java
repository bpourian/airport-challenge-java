package com.cleo.airport;

import java.util.ArrayList;

public class Airport {

    Weather weather;
    private int defaultHangarSpaces = 20;
    public ArrayList <Plane> hangarArrayList;

    public Airport(Weather weather)
    {
        this.weather = weather;
        hangarArrayList = new ArrayList<Plane>(defaultHangarSpaces);
    }

    public String landPlane(Plane plane)
    {
        if (this.isStormy() == false) {
            plane.land();
            return "Plane has landed";
        }
        if (this.isStormy() == true) {
            return "Unable to land due to storm";
        } else return "Unable to access weather information";
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

    public int getHangarSpaces()
    {
        return defaultHangarSpaces;
    }

    public void setHangarSpaces(int spaces)
    {
        this.defaultHangarSpaces = spaces;
    }

    public void storePlane(Plane plane)
    {
        if (defaultHangarSpaces > hangarArrayList.size()) {
            this.hangarArrayList.add(plane);
        }
        if (defaultHangarSpaces == hangarArrayList.size()) {
            throw new RuntimeException("Unable to add plane, Hangar full!");
        }

    }


}
