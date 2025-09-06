package com.example.project.dto;

public class OnlineProductDto {
    private String name;
    private int price;
    private String link;

    public OnlineProductDto(String name, int price, String link) {
        this.name = name;
        this.price = price;
        this.link = link;
    }

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }
}
