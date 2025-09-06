package com.example.project.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OfflineService {

    public List<Map<String, Object>> getStores(double lat, double lng) {
        // TODO: 실제 지도 API 호출로 대체
        List<Map<String, Object>> stores = new ArrayList<>();

        Map<String, Object> s1 = new HashMap<>();
        s1.put("name", "컴퓨터 매장 A");
        s1.put("distance", "500m");
        s1.put("priceExample", 150_000);
        stores.add(s1);

        Map<String, Object> s2 = new HashMap<>();
        s2.put("name", "컴퓨터 매장 B");
        s2.put("distance", "800m");
        s2.put("priceExample", 140_000);
        stores.add(s2);

        return stores;
    }
}
