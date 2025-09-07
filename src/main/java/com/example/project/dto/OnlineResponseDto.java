package com.example.project.dto;

import java.util.List;

public class OnlineResponseDto {
    private List<OnlineProductDto> products;

    public OnlineResponseDto() {}

    public OnlineResponseDto(List<OnlineProductDto> products) {
        this.products = products;
    }

    public List<OnlineProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<OnlineProductDto> products) {
        this.products = products;
    }
}
