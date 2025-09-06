package com.example.project.service;


import com.example.project.dto.OnlineProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OnlineService {

//    public List<Map<String, Object>> getProducts(String spec) {
//        List<Map<String, Object>> products = new ArrayList<>();
//
//        Map<String, Object> p1 = new HashMap<>();
//        p1.put("name", "CPU i5 12400");
//        p1.put("price", 200_000);
//        p1.put("link", "https://shopping.naver.com/product/123");
//        products.add(p1);
//
//        Map<String, Object> p2 = new HashMap<>();
//        p2.put("name", "RAM 16GB");
//        p2.put("price", 80_000);
//        p2.put("link", "https://shopping.naver.com/product/456");
//        products.add(p2);
//
//        return products;
//    }

    // 2025.09.06
    // postman에 실행 완료
    public List<OnlineProductDto> getProducts(String spec) {
        List<OnlineProductDto> products = new ArrayList<>();
        products.add(new OnlineProductDto("CPU i5 12400", 200_000, "https://shopping.naver.com/product/123"));
        products.add(new OnlineProductDto("RAM 16GB", 80_000, "https://shopping.naver.com/product/456"));
        return products;
    }
}
