package com.example.project.service;


import com.example.project.dto.OnlineProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OnlineService {

    public List<OnlineProductDto> getProducts(String spec) {
        List<OnlineProductDto> products = new ArrayList<>();

        // 테스트용 더미 데이터
        products.add(new OnlineProductDto("CPU i5 12400", 200_000, "https://shopping.naver.com/product/123"));
        products.add(new OnlineProductDto("RAM 16GB", 80_000, "https://shopping.naver.com/product/456"));

        return products;
    }
}