package org.example.dea2.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class SellingAddApiRequest {
    private String vehicleName;
    private String year;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal bidAmount;
    private Byte image;
    private String description;
    private int userId;
}
