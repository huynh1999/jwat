package com.jwat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwat.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}
