package com.example.project.controller;

import com.example.project.dto.GptRequestDto;
import com.example.project.dto.OnlineProductDto;
import com.example.project.service.OnlineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/online")
@CrossOrigin(origins = "http://localhost:5173")
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