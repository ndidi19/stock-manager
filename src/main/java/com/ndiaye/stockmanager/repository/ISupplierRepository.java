package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierRepository extends JpaRepository<Supplier, Long> {
}
