package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale, Long> {
}
