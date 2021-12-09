package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.SaleLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleLineRepository extends JpaRepository<SaleLine, Long> {
}
