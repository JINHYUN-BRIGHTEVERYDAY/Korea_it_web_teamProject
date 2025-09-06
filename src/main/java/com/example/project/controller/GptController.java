package com.example.project.controller;

import com.example.project.dto.GptRequestDto;
import com.example.project.dto.GptResponseDto;
import com.example.project.service.GptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/gpt")
public class GptController {

    private final GptService gptService;

    public GptController(GptService gptService) {
        this.gptService = gptService;
    }

    @PostMapping("/api/gpt")
    public GptResponseDto getSpec(@RequestBody GptRequestDto request) {
        return gptService.getSpec(request);
    }


//    @PostMapping
//    public Map<String, Object> getRecommendation(@RequestBody Map<String, String> request) {
//        String spec = request.get("spec");
//        return gptService.getRecommendation(spec);
//     }


}
