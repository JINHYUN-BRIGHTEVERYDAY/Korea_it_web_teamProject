package com.example.project.dto;

import java.util.List;

public class OfflineResponseDto {
    private List<OfflineStoreDto> stores;

    public OfflineResponseDto() {}

    public OfflineResponseDto(List<OfflineStoreDto> stores) {
        this.stores = stores;
    }

    public List<OfflineStoreDto> getStores() {
        return stores;
    }

    public void setStores(List<OfflineStoreDto> stores) {
        this.stores = stores;
    }
}
