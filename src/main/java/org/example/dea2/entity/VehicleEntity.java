package org.example.dea2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity

public class VehicleEntity {
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

    @ManyToOne
    @JoinColumn(name = "id")
    private UserDetailsEntity user;

}
