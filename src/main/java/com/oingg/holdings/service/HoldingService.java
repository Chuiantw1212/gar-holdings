package com.oingg.holdings.service;

import com.oingg.holdings.domain.Holding;
import com.oingg.holdings.dto.HoldingRequest;

public interface HoldingService {

    Holding addHolding(HoldingRequest holdingRequest);
}
