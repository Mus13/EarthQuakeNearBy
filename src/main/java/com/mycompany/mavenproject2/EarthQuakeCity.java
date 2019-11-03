/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Mustapha
 */
public class EarthQuakeCity {
    
    private String title;
    private double lon;
    private double lat;
    private double distance;
    

    public EarthQuakeCity(String title, double lon, double lat, double distance) {
        this.title = title;
        this.lon = lon;
        this.lat = lat;
        this.distance = distance;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    
    public String getTitle() {
        return title;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }

    public double getDistance() {
        return distance;
    }
    
    
    
}
