package com.oingg.holdings.service;

import com.oingg.holdings.domain.Holding;
import com.oingg.holdings.dto.HoldingRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class HoldingServiceImpl implements HoldingService {

    private final List<Holding> holdings = new ArrayList<>();

    @Override
    public Holding addHolding(HoldingRequest holdingRequest) {
        Holding holding = new Holding(
                holdingRequest.getStockId(),
                holdingRequest.getQuantity(),
                holdingRequest.getPrice()
        );
        holding.setId(UUID.randomUUID().toString());
        holdings.add(holding);
        return holding;
    }
}
