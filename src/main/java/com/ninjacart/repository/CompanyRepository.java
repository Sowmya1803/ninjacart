package com.ninjacart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninjacart.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
	public List<CompanyEntity> findAll();
	
	public CompanyEntity findById(int id);

}

