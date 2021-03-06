package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
