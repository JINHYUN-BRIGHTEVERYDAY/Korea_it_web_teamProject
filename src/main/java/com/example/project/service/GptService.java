package com.example.project.service;

import com.example.project.dto.GptRequestDto;
import com.example.project.dto.GptResponseDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GptService {

    public Map<String, Object> getRecommendation(String spec) {
        Map<String, Object> result = new HashMap<>();

        result.put("recommendation", "예시 사양: CPU i5, RAM 16GB, SSD 512GB");
        return result;
    }

    public GptResponseDto getSpec(GptRequestDto request) {
        // request.getSpec()으로 사용
        return new GptResponseDto("추천 사양: CPU i5, RAM 16GB, SSD 512GB");
    }

}
