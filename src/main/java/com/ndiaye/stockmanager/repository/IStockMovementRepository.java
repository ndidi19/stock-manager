package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockMovementRepository extends JpaRepository<StockMovement, Long> {
}
