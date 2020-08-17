package com.ninjacart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninjacart.entities.StockEntity;

public interface StockRepository extends JpaRepository<StockEntity, Long> {
	public List<StockEntity> findAll();
	public StockEntity findById(int id);

}
