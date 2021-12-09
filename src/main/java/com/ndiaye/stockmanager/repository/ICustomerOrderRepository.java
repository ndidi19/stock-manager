package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
}
