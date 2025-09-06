package com.example.project.dto;

public class OfflineStoreDto {
    private String name;
    private String distance;
    private int priceExample;

    public OfflineStoreDto(String name, String distance, int priceExample) {
        this.name = name;
        this.distance = distance;
        this.priceExample = priceExample;
    }

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDistance() { return distance; }
    public void setDistance(String distance) { this.distance = distance; }

    public int getPriceExample() { return priceExample; }
    public void setPriceExample(int priceExample) { this.priceExample = priceExample; }
}