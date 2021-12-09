package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
