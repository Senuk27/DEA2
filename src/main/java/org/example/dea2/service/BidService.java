package org.example.dea2.service;

import org.example.dea2.dto.request.BidApiRequest;
import org.example.dea2.dto.response.ApiResponse;

public interface BidService {
    ApiResponse save(BidApiRequest request);

    ApiResponse view();
}
