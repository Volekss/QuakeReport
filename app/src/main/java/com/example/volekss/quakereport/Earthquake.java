package com.example.volekss.quakereport;

/**
 * Created by Volekss on 06-Nov-17.
 */

public class Earthquake {
    private double magnitude;

    public String getDistanceToPlace() {
        return distanceToPlace;
    }

    public void setDistanceToPlace(String distanceToPlace) {
        this.distanceToPlace = distanceToPlace;
    }

    private String distanceToPlace;
    private String location;
    private long timeInMilliseconds;

    public String getUrl() {
        return url;
    }

    private String url;

    @Override
    public String toString() {
        return "Earthquake{" +
                "magnitude='" + magnitude + '\'' +
                ", distanceToPlace='" + distanceToPlace + '\'' +
                ", location='" + location + '\'' +
                ", timeInMilliseconds=" + timeInMilliseconds +
                '}';
    }

    public Earthquake(double magnitude, String distanceToPlace, String location, long timeInMilliseconds, String url) {
        this.magnitude = magnitude;
        this.distanceToPlace = distanceToPlace;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }


    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}
