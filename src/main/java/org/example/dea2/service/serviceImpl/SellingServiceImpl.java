package org.example.dea2.service.serviceImpl;

import org.example.dea2.dto.request.SellingAddApiRequest;
import org.example.dea2.dto.response.SellingAddApiResponse;
import org.example.dea2.entity.SellingAddEntity;
import org.example.dea2.repository.SellingAddRepository;
import org.example.dea2.service.SellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class SellingServiceImpl implements SellingService {
    @Autowired
    private SellingAddRepository sellingAddRepository;


    @Override
    public SellingAddApiResponse add(SellingAddApiRequest request) {
        SellingAddApiResponse response = new SellingAddApiResponse();
        SellingAddEntity sellingAddEntity = new SellingAddEntity();




        return response;
    }
}
