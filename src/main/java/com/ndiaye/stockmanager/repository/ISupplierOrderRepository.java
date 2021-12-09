package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.SupplierOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierOrderRepository extends JpaRepository<SupplierOrder, Long> {
}
