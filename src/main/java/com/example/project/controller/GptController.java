package com.example.project.controller;

import com.example.project.dto.GptRequestDto;
import com.example.project.dto.GptResponseDto;
import com.example.project.service.GptService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gpt")
@CrossOrigin(origins = "http://localhost:5173")
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