package com.example.project.controller;

import com.example.project.dto.GptRequestDto;
import com.example.project.dto.OnlineProductDto;
import com.example.project.service.OnlineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/online")
public class OnlineController {

    private final OnlineService onlineService;

    public OnlineController(OnlineService onlineService) {
        this.onlineService = onlineService;
    }

    @PostMapping("/api/online")
    public List<OnlineProductDto> getOnlineProducts(@RequestBody GptRequestDto request) {
        return onlineService.getProducts(request.getSpec());
    }

//    @PostMapping
//    public List<Map<String, Object>> getOnlineProducts(@RequestBody Map<String, String> request) {
//        String spec = request.get("spec");
//        return onlineService.getProducts(spec);
//    }
}
