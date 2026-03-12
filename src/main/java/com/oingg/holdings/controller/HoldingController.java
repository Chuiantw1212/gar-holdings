package com.oingg.holdings.controller;

import com.oingg.holdings.domain.Holding;
import com.oingg.holdings.dto.HoldingRequest;
import com.oingg.holdings.service.HoldingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/holdings")
public class HoldingController {

    private final HoldingService holdingService;

    @Autowired
    public HoldingController(HoldingService holdingService) {
        this.holdingService = holdingService;
    }

    @PostMapping
    public ResponseEntity<Holding> addHolding(@RequestBody HoldingRequest holdingRequest) {
        Holding newHolding = holdingService.addHolding(holdingRequest);
        return new ResponseEntity<>(newHolding, HttpStatus.CREATED);
    }
}
