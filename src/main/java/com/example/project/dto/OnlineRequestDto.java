package com.example.project.dto;

public class OnlineRequestDto {
    private String spec;

    public OnlineRequestDto() {}

    public OnlineRequestDto(String spec) {
        this.spec = spec;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
