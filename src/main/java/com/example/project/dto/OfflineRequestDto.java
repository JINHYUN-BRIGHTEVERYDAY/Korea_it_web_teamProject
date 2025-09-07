package com.example.project.dto;

public class OfflineRequestDto {
    private String spec;
    private double lat;
    private double lng;

    public OfflineRequestDto() {}

    public OfflineRequestDto(String spec, double lat, double lng) {
        this.spec = spec;
        this.lat = lat;
        this.lng = lng;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
