package com.cleo.airport;

public class Plane {

    private String status;

    public void land() {
        this.status = "Plane has landed";
    }

    public String getStatus(){
        return this.status;
    }

    public void takeOff() {
        this.status = "Plane in the air";
    }
}
