package org.example.dea2.service;

import org.example.dea2.dto.request.SellingAddApiRequest;
import org.example.dea2.dto.response.SellingAddApiResponse;

public interface SellingService {
    SellingAddApiResponse add(SellingAddApiRequest request);
}
