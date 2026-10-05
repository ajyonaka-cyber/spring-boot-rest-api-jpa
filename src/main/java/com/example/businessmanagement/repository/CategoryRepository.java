package com.example.businessmanagement.repository;

import com.example.businessmanagement.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}