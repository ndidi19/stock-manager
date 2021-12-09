package com.ndiaye.stockmanager.repository;

import com.ndiaye.stockmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
