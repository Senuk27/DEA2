package org.example.dea2.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class SellingAddApiRequest {
    private int vehicleId;
    private String vehicleName;
    private String year;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal bidAmount;
    private String imagePath;
    private String description;
    private int userId;
}
