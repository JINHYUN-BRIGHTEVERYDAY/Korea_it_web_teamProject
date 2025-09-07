package com.example.project.controller;

import com.example.project.dto.LocationRequestDto;
import com.example.project.dto.OfflineStoreDto;
import com.example.project.service.OfflineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/offline")
public class OfflineController {

    private final OfflineService offlineService;

    public OfflineController(OfflineService offlineService) {
        this.offlineService = offlineService;
    }

    // POST /api/offline/search
    @PostMapping("/search")
    public List<OfflineStoreDto> getOfflineStores(@RequestBody LocationRequestDto request) {
        return offlineService.getStores(request.getLat(), request.getLng());
    }
}
