package com.example.project.controller;

import com.example.project.service.OfflineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/offline")
public class OfflineController {

    private final OfflineService offlineService;

    public OfflineController(OfflineService offlineService) {
        this.offlineService = offlineService;
    }

    @PostMapping
    public List<Map<String, Object>> getOfflineStores(@RequestBody Map<String, Object> request) {
        double lat = (double) request.get("lat");
        double lng = (double) request.get("lng");
        return offlineService.getStores(lat, lng);
    }
}

