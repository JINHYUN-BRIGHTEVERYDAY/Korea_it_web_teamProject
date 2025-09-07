package com.example.project.controller;

import com.example.project.dto.GptRequestDto;
import com.example.project.dto.GptResponseDto;
import com.example.project.service.GptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gpt")
public class GptController {

    private final GptService gptService;

    public GptController(GptService gptService) {
        this.gptService = gptService;
    }

    // POST /api/gpt/recommend
    @PostMapping("/recommend")
    public GptResponseDto getSpec(@RequestBody GptRequestDto request) {
        return gptService.getSpec(request);
    }
}