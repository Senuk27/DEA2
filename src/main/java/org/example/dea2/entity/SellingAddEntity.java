package org.example.dea2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.LocalDate;

@Data
@Entity

public class SellingAddEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sellingAddId;
    private String vehicleName;
    private String year;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal bidAmount;
    private String imagePath;
    private String description;
    private int userId;
}
