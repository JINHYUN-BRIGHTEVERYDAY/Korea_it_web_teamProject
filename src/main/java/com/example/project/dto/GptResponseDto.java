package com.example.project.dto;

public class GptResponseDto {
    private String recommendation;

    public GptResponseDto() {}

    public GptResponseDto(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
}
