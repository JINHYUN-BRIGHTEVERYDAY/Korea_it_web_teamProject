package com.example.project.service;

import com.example.project.dto.GptRequestDto;
import com.example.project.dto.GptResponseDto;
import org.springframework.stereotype.Service;

@Service
public class GptService {

    public GptResponseDto getSpec(GptRequestDto request) {
        // request.getSpec() 활용 가능
        return new GptResponseDto("추천 사양: CPU i5, RAM 16GB, SSD 512GB");
    }
}