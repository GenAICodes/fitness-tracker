
package com.fitness.tracker.dto;

import java.time.LocalDate;

public class ActivityDto {
    private Long id;
    private String description;
    private LocalDate date;
    private int duration;
    private double distance;
    private String type;
    private String intensity;
    private String location;

    // Constructor
    public ActivityDto(Long id, String description, LocalDate date, int duration, double distance, String type, String intensity, String location) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.duration = duration;
        this.distance = distance;
        this.type = type;
        this.intensity = intensity;
        this.location = location;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
