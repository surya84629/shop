package com.jsp.SweetShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.SweetShop.entity.Sweet;

@Repository
public interface SweetRepository extends JpaRepository<Sweet, Integer> {
    // Additional methods if needed
}
