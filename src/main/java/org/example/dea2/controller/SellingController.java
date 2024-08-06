package org.example.dea2.controller;

import org.example.dea2.dto.request.SellingAddApiRequest;
import org.example.dea2.dto.response.SellingAddApiResponse;
import org.example.dea2.service.SellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/selling")

public class SellingController {
    @Autowired
    private SellingService sellingService;
   @PostMapping ("/add")
    public SellingAddApiResponse add(@ModelAttribute SellingAddApiRequest request) {
       return sellingService.add(request);


   }
}
