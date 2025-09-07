package com.example.project.service;

import com.example.project.dto.OfflineStoreDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfflineService {

    public List<OfflineStoreDto> getStores(double lat, double lng) {
        List<OfflineStoreDto> stores = new ArrayList<>();

        // 테스트용 더미 데이터
        stores.add(new OfflineStoreDto("컴퓨터존", "450m", 160_000));
        stores.add(new OfflineStoreDto("IT마트", "720m", 155_000));
        stores.add(new OfflineStoreDto("하이컴", "1.2km", 158_000));

        return stores;
    }
}