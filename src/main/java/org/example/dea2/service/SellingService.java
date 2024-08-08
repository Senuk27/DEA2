package org.example.dea2.service;

import org.example.dea2.dto.request.SellingAddApiRequest;
import org.example.dea2.dto.response.ApiResponse;

public interface SellingService {
    ApiResponse add(SellingAddApiRequest request);

    ApiResponse get();

    ApiResponse delete(String vehicleId);

    ApiResponse update(SellingAddApiRequest request);
}
