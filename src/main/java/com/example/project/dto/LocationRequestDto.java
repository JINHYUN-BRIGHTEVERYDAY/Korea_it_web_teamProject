package com.example.project.dto;


// 위도, 경도 받기 용도
public class LocationRequestDto {
    private double lat;
    private double lng;

    public LocationRequestDto() {
    }

    public LocationRequestDto(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}