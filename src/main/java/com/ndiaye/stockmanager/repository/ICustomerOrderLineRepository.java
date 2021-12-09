package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.CustomerOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerOrderLineRepository extends JpaRepository<CustomerOrderLine, Long> {
}
