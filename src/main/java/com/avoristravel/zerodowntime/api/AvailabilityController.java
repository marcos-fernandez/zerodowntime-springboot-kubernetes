package com.avoristravel.zerodowntime.api;

import com.avoristravel.zerodowntime.service.SlowService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvailabilityController {

    private final SlowService slowService;

    public AvailabilityController(SlowService slowService) {
        this.slowService = slowService;
    }

    @PostMapping("/api/availaiblity")
    public String availaiblity() {
        return slowService.search();
    }
}
