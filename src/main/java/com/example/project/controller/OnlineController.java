package com.example.project.controller;

import com.example.project.dto.GptRequestDto;
import com.example.project.dto.OnlineProductDto;
import com.example.project.service.OnlineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/online")
public class OnlineController {

    private final OnlineService onlineService;

    public OnlineController(OnlineService onlineService) {
        this.onlineService = onlineService;
    }

    // POST /api/online/search
    @PostMapping("/search")
    public List<OnlineProductDto> getOnlineProducts(@RequestBody GptRequestDto request) {
        return onlineService.getProducts(request.getSpec());
    }
}