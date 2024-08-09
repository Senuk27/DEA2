package org.example.dea2.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BidApiRequest {
    private int userId;
    private int sellingId;
    private BigDecimal bidAmount;




}
