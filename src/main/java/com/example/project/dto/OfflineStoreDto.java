package com.example.project.dto;


public class OfflineStoreDto {
    private String name;
    private String distance;
    private int price;

    public OfflineStoreDto() {}

    public OfflineStoreDto(String name, String distance, int price) {
        this.name = name;
        this.distance = distance;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}