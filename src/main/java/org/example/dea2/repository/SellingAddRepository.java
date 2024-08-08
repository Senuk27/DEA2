package org.example.dea2.repository;

import org.example.dea2.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellingAddRepository extends JpaRepository<VehicleEntity, Integer> {

}
